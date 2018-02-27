package com.latido.view.dao.infra;

import com.latido.model.entities.Menu;

public class MenuConfigDAO {
	private static MenuConfigDAO _MenuConfigDAO;
	private Menu menu1;
	private Menu menu2;
	private Menu menu3;
	private int level;
	private Menu menuSelected;
	
	
	private MenuConfigDAO() {
		
	}
	
	public static MenuConfigDAO getInstance() {
		if(_MenuConfigDAO == null)
			_MenuConfigDAO = new MenuConfigDAO();
		return _MenuConfigDAO;
	}

	/**
	 * @return the menu1
	 */
	public Menu getMenu1() {
		return menu1;
	}

	/**
	 * @param menu1 the menu1 to set
	 */
	public void setMenu1(Menu menu1) {
		this.menu1 = menu1;
	}

	/**
	 * @return the menu2
	 */
	public Menu getMenu2() {
		return menu2;
	}

	/**
	 * @param menu2 the menu2 to set
	 */
	public void setMenu2(Menu menu2) {
		this.menu2 = menu2;
	}

	/**
	 * @return the menu3
	 */
	public Menu getMenu3() {
		return menu3;
	}

	/**
	 * @param menu3 the menu3 to set
	 */
	public void setMenu3(Menu menu3) {
		this.menu3 = menu3;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the menuSelected
	 */
	public Menu getMenuSelected() {
		return menuSelected;
	}

	/**
	 * @param menuSelected the menuSelected to set
	 */
	public void setMenuSelected(Menu menuSelected) {
		this.menuSelected = menuSelected;
	}

}
