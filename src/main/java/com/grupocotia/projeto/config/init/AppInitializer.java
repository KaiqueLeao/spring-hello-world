package com.grupocotia.projeto.config.init;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.grupocotia.projeto.config.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	/**
	 * Força o encoding da aplicação 
	 */
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter chracterEncondingFilter = new CharacterEncodingFilter();
		chracterEncondingFilter.setEncoding("UTF-8");
		chracterEncondingFilter.setForceEncoding(true);
		
		return new Filter[] { chracterEncondingFilter };
	}

}