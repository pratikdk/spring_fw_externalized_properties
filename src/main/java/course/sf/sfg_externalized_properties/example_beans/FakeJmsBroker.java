package course.sf.sfg_externalized_properties.example_beans;

public class FakeJmsBroker {
    private String useraname;
    private String password;
    private String url;

    public FakeJmsBroker(String useraname, String password, String url) {
        this.useraname = useraname;
        this.password = password;
        this.url = url;
    }

    public String getUseraname() {
        return useraname;
    }

    public void setUseraname(String useraname) {
        this.useraname = useraname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
