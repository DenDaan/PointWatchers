package be.vleugels.daan.ww.impl;

import junit.framework.TestCase;
import be.vleugels.daan.ww.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}