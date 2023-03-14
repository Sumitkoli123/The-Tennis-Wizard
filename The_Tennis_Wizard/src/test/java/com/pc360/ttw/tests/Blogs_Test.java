package com.pc360.ttw.tests;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pc360.ttw.base.BaseClass;
import com.pc360.ttw.pages.Blogs;

@Listeners(com.pc360.ttw.utility.ListenerTest.class)
public class Blogs_Test extends BaseClass {

	@Test(dependsOnMethods= {"aboutUs"}, ignoreMissingDependencies= true)
	public void blogs() throws InterruptedException, IOException {
		
		Blogs blog = new Blogs(driver);
		blog.blogs();
		blog.Select_Blog();
		blog.This_Article_Useful();
		blog.Add_new_comment();
		blog.Join_Our_Newsletter();
		blog.Join_Our_Newsletter_OnBlogsPage();
	}
}
