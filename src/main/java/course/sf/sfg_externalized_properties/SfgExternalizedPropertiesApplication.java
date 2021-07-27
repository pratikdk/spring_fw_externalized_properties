package course.sf.sfg_externalized_properties;

import course.sf.sfg_externalized_properties.example_beans.FakeJmsBroker;
import course.sf.sfg_externalized_properties.example_beans.FakeUserProp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgExternalizedPropertiesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgExternalizedPropertiesApplication.class, args);

        FakeUserProp fakeUserProp = (FakeUserProp) ctx.getBean(FakeUserProp.class);
        System.out.println(fakeUserProp.getUsername() + " " + fakeUserProp.getPassword());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUseraname() + " " + fakeJmsBroker.getPassword());
    }

}
