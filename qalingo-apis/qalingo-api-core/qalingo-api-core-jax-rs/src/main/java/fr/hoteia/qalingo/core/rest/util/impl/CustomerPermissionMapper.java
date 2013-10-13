package fr.hoteia.qalingo.core.rest.util.impl;

import fr.hoteia.qalingo.core.domain.CustomerPermission;
import fr.hoteia.qalingo.core.rest.pojo.CustomerPermissionPojo;
import org.springframework.stereotype.Component;

@Component("customerPermissionMapper")
public class CustomerPermissionMapper extends AbstractPojoMapper<CustomerPermission, CustomerPermissionPojo> {

    @Override
    public Class<CustomerPermission> getObjectType() {
        return CustomerPermission.class;
    }

    @Override
    public Class<CustomerPermissionPojo> getPojoType() {
        return CustomerPermissionPojo.class;
    }
}
