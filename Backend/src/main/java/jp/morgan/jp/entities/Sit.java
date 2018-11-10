package jp.morgan.jp.entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.ANY,
                isGetterVisibility = JsonAutoDetect.Visibility.ANY)
@Entity
public class Sit extends IdEntity {

    @Column
    private DateTime startDate;

    @Column
    private DateTime endDate;

    @Column
    private Long patientId;

    @Column
    private Boolean canceled;

    @ManyToMany(mappedBy = "sits")
    private List<Carrer> carrerList;

    public Sit() {
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Boolean getCanceled() {
        return canceled;
    }

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }

    public List<Carrer> getCarrerList() {
        return carrerList;
    }

    public void setCarrerList(List<Carrer> carrerList) {
        this.carrerList = carrerList;
    }
}
