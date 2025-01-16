package sn.edu.ept.git.dic2.demoServiceWeb.core;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI configureOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("APIs Gestion Administrative de l'EPT")
                                .description("APIs a utiliser par les applications internes de l'EPT")
                                .version("1.0.1")
                                .contact(
                                        new Contact()
                                                .name("Lamine Ndiaye")
                                                .email("nidayeml@ept.sn")
                                                .url("https://github.com/mlndiaye")
                                )

                )
                ;
    }
}
