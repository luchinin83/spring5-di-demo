package guru.springframework.examplebeans;

public class FakeJmsSource {

    private String jmsUser;
    private String jmsPassword;
    private String jmsDburl;

    public String getJmsUser() {
        return jmsUser;
    }

    public void setJmsUser(String jmsUser) {
        this.jmsUser = jmsUser;
    }

    public String getJmsPassword() {
        return jmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public String getJmsDburl() {
        return jmsDburl;
    }

    public void setJmsDburl(String jmsDburl) {
        this.jmsDburl = jmsDburl;
    }
}
