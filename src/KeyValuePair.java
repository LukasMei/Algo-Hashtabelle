public class KeyValuePair<key, value> {

    private Integer key;
    private String value;

    public KeyValuePair(Integer key, String value) {
        this.key = key;
        this.value = value;
    }



    public void setValue(String  value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getKey() {
        return key;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
