package dao;

import java.util.List;

public interface Dao<E> {

	public boolean save();

	public boolean update();

	public E findById();

	public List<E> findAll();

	public boolean delete();

}
