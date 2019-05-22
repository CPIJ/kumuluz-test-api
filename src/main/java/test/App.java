package test;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@ApplicationPath("")
@OpenAPIDefinition(info = @Info(title = "Test API"))
public class App extends Application {

}
