package src.com.jpa.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
// @DiscriminatorValue(value = "NS")
// @PrimaryKeyJoinColumn(referencedColumnName="sid")
public class InheritNonTeachingStaff extends InheritStaff {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String areaexpertise;

  public InheritNonTeachingStaff(int sid, String sname, String areaexpertise) {
    super(sid, sname);
    this.areaexpertise = areaexpertise;
  }

  public InheritNonTeachingStaff() {
    super();
  }

  public String getAreaexpertise() {
    return areaexpertise;
  }

  public void setAreaexpertise(String areaexpertise) {
    this.areaexpertise = areaexpertise;
  }
}