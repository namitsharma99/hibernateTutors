package src.com.jpa.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
// @DiscriminatorValue(value = "TS")
// @PrimaryKeyJoinColumn(referencedColumnName="sid")
public class InheritTeachingStaff extends InheritStaff {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String qualification;
  private String subjectexpertise;

  public InheritTeachingStaff(int sid, String sname,

  String qualification, String subjectexpertise) {
    super(sid, sname);
    this.qualification = qualification;
    this.subjectexpertise = subjectexpertise;
  }

  public InheritTeachingStaff() {
    super();
  }

  public String getQualification() {
    return qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public String getSubjectexpertise() {
    return subjectexpertise;
  }

  public void setSubjectexpertise(String subjectexpertise) {
    this.subjectexpertise = subjectexpertise;
  }
}
