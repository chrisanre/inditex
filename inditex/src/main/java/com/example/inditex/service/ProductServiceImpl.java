package com.example.inditex.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.inditex.entity.PricesEntity;
import com.example.inditex.model.ProductResponseBean;
import com.example.inditex.repository.PricesRepository;

/**
 * The Class ProductServiceImpl.
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	/** The prices repo. */
	private PricesRepository pricesRepo; 
	
	
	/**
	 * Instantiates a new product service impl.
	 *
	 * @param pricesRepo the prices repo
	 */
	public ProductServiceImpl(PricesRepository pricesRepo) {
		super();
		this.pricesRepo = pricesRepo;
	}




	@Override
	public List<ProductResponseBean> retrieveProductInfoList(String date, String productId, Integer brandId) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss");
		LocalDateTime localdate = LocalDateTime.parse(date, formatter);

		List<PricesEntity> pricesInfoList = pricesRepo.retrieveProductsInfoList(localdate, productId, brandId);

		if (!CollectionUtils.isEmpty(pricesInfoList)) {

			return pricesInfoList.stream()
					.map(p -> ProductResponseBean.builder().productId(p.getProductId()).brandId(p.getBrandId())
							.rate(p.getRate()).startEffectiveDate(p.getStartDate()).endEffectiveDate(p.getEndDate())
							.price(p.getPrice()).currency(p.getCurr()).build())
					.collect(Collectors.toList());
		} else {
			return List.of();
		}

	}

	
	
}
