package me.fabio.resumebuilder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participation")
public final class Participation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="start_date")
    private String startDate;
	
	@Column(name="end_date")
    private String endDate;
    
    private String sponsores;
    private String note;
    private String topic;
    private String place;
    
    @Column(name="part_name")
    private String partName;
    
    public enum ParticipationName {
        TRAINING, WORKSHOPS, FDP, STTP, OTHERS
    }
    
    public Participation() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSponsores() {
        return sponsores;
    }

    public void setSponsores(String sponsores) {
        this.sponsores = sponsores;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String Note) {
        this.note = Note;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public static ParticipationName getParticipation(String partName) {
        for (ParticipationName pName : ParticipationName.values()) {
            if (partName.equals(pName.name())) {
                return pName;
            }
        }
        return null;
    }
    
}
