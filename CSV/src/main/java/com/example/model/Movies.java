package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movies {

    @Id
    private String imdb_title_id;
    private String title;
    private String original_title;
    private String year;
    private String date_published;
    private String genre;
    private String duration;
    private String country;
    private String language;
    private String director;
    private String writer;
    private String production_company;
    private String actors;
    private String description;
    private String avg_vote;
    private String budget;
    private String usa_gross_income;
    private String worlwide_gross_income;
    private String metascore;
    private String reviews_from_users;
    private String reviews_from_critics;


    public String getImdb_title_id() {
		return imdb_title_id;
	}


	public void setImdb_title_id(String imdb_title_id) {
		this.imdb_title_id = imdb_title_id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getOriginal_title() {
		return original_title;
	}


	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getDate_published() {
		return date_published;
	}


	public void setDate_published(String date_published) {
		this.date_published = date_published;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getProduction_company() {
		return production_company;
	}


	public void setProduction_company(String production_company) {
		this.production_company = production_company;
	}


	public String getActors() {
		return actors;
	}


	public void setActors(String actors) {
		this.actors = actors;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getAvg_vote() {
		return avg_vote;
	}


	public void setAvg_vote(String avg_vote) {
		this.avg_vote = avg_vote;
	}


	public String getBudget() {
		return budget;
	}


	public void setBudget(String budget) {
		this.budget = budget;
	}


	public String getUsa_gross_income() {
		return usa_gross_income;
	}


	public void setUsa_gross_income(String usa_gross_income) {
		this.usa_gross_income = usa_gross_income;
	}


	public String getWorlwide_gross_income() {
		return worlwide_gross_income;
	}


	public void setWorlwide_gross_income(String worlwide_gross_income) {
		this.worlwide_gross_income = worlwide_gross_income;
	}


	public String getMetascore() {
		return metascore;
	}


	public void setMetascore(String metascore) {
		this.metascore = metascore;
	}


	public String getReviews_from_users() {
		return reviews_from_users;
	}


	public void setReviews_from_users(String reviews_from_users) {
		this.reviews_from_users = reviews_from_users;
	}


	public String getReviews_from_critics() {
		return reviews_from_critics;
	}


	public void setReviews_from_critics(String reviews_from_critics) {
		this.reviews_from_critics = reviews_from_critics;
	}


	@Override
    public String toString() {
        return "Movies{" +
                "imdb_title_id=" + imdb_title_id +
                ", title='" + title + '\'' +
                ", original_title='" + original_title + '\'' +
                ", year=" + year +
                ", date_published=" + date_published +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", production_company='" + production_company + '\'' +
                ", actors='" + actors + '\'' +
                ", description='" + description + '\'' +
                ", avg_vote='" + avg_vote + '\'' +
                ", budget=" + budget +
                ", usa_gross_income=" + usa_gross_income +
                ", worlwide_gross_income=" + worlwide_gross_income +
                ", metascore=" + metascore +
                ", reviews_from_users=" + reviews_from_users +
                ", reviews_from_critics=" + reviews_from_critics +
                '}';
    }

}
