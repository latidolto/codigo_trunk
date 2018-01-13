package com.latido.view.managedbean;

import com.latido.view.managedbean.utils.CommonManagedBean;

import net.bootsfaces.component.navBarLinks.NavBarLinks;

public class Index extends CommonManagedBean{
	private NavBarLinks navLinks;
	
	public Index() {
		super(CommonManagedBean.INDEX_RESOURCE);
	}

	/**
	 * @return the navLinks
	 */
	public NavBarLinks getNavLinks() {
		return navLinks;
	}

	/**
	 * @param navLinks the navLinks to set
	 */
	public void setNavLinks(NavBarLinks navLinks) {
		this.navLinks = navLinks;
	}

}
