package com.tanvir.celeb.User;

import lombok.Data;
import lombok.NonNull;
import javax.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Data
@Table(name = "artist")
@EntityListeners(AuditingEntityListener.class)
public class Artist{
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
	@Column(name = "id")
	public Long Id;
	
	@Column(name = "artist_name")
	@NonNull
	public String artistName;
	
	@Column(name = "json")
	@NonNull
	public String data;
	
	@Column(name = "refresh_url")
	@NonNull
	public String refreshUrl;
	
	@Column (name = "is_active")
	@NonNull
	public Boolean isActive;
	
	@Column (name = "created_time")
	@NonNull
    @CreatedDate
	public String createdTime;
	
	@Column (name = "updated_time")
	@NonNull
	@LastModifiedDate
	public String updatedTime;
	
	
}
