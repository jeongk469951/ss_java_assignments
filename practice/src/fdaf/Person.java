package fdaf;

import java.io.Serializable;

public class Person implements Serializable{

    private static final long serialVersionUID = 8877637381860532709L;

    transient private Integer ssn;
    private String name;

    public Person(Integer ssn, String name) {
        super();
        this.ssn = ssn;
        this.name = name;
    }
    /**
     * @return the ssn
     */
    public Integer getSsn() {
        return ssn;
    }
    /**
     * @param ssn the ssn to set
     */
    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (ssn == null) {
            if (other.ssn != null)
                return false;
        } else if (!ssn.equals(other.ssn))
            return false;
        return true;
    }

}
