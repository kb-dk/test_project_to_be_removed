package dk.kb.test.webservice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import dk.kb.test.api.v1.impl.KbTestApiServiceImpl;
import dk.kb.test.api.v1.impl.ServiceApiServiceImpl;


public class Application_v1 extends javax.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<>(Arrays.asList(
                JacksonJsonProvider.class,
                JacksonXMLProvider.class,
                KbTestApiServiceImpl.class,
                ServiceApiServiceImpl.class,
                dk.kb.util.webservice.exception.ServiceExceptionMapper.class
        ));
    }


}
