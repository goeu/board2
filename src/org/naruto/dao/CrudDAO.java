package org.naruto.dao;

import java.util.List;

import org.zerock.dto.PagingDTO;

public interface CrudDAO<V,K> {
	
	public boolean insert(V vo);
	
	public V select(K key);
	
	public boolean update(V vo);
	
	public boolean delete(K key);
	
	public List<V> getList(PagingDTO dto);
}
