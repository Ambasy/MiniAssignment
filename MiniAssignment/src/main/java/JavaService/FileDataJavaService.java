package com.example.MovieList.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.example.MovieList.Entity.FileDataEntity;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public interface FileDataJavaService {

	@Autowired
	private MoviesDe mde;
	
	String line = "";
	
	public void saveMovies() {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/main/resources/movies.csv"));
			while((line=br.readLine())!=null) {
				 String [] data = line.split(",");
				 Movies m = new Movies();
				 
				 m.setActors(data[0]);
				 m.setAvg_vote(data[1]);
				 m.setBudget(data[2]);
				 m.setCountry(data[3]);
				 m.setDate_published(data[4]);
				 m.setDescription(data[5]);
				 m.setDirector(data[6]);
				 m.setDuration(data[7]);
				 m.setGenre(data[8]);
				 m.setImdb_title_id(data[9]);
				 m.setLanguage(data[10]);
				 m.setMetascore(data[11]);
				 m.setOriginal_title(data[12]);
				 m.setProduction_company(data[13]);
				 m.setReviews_from_critics(data[14]);
				 m.setReviews_from_users(data[15]);
				 m.setTitle(data[16]);
				 m.setUsa_gross_income(data[17]);
				 m.setWorlwide_gross_income(data[18]);
				 m.setWriter(data[19]);
				 m.setYear(data[20]);
				 
				 mde.save(m);
				 
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
