import java.io.*;

public class Skill {
	//creating the instance variables
	private String name;
	private String optional;
	private String short_desc;
	private int stat_affinity;
	private int ranks;
	private Skill next_Skill;

	public Skill(String name, String optional, String short_desc, int stat_affinity, int ranks, Skill next_Skill) {
		//calling the super class constructor
		super();
		this.name = name;
		this.optional = optional;
		this.short_desc = short_desc;
		this.stat_affinity = stat_affinity;
		this.ranks = ranks;
		this.next_Skill = next_Skill;
	}
	//creating the getters and setters for access the instance variables craeted before
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	public String getShort_desc() {
		return short_desc;
	}
	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
	}
	public int getStat_affinity() {
		return stat_affinity;
	}
	public void setStat_affinity(int stat_affinity) {
		this.stat_affinity = stat_affinity;
	}
	public int getRanks() {
		return ranks;
	}
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}
	public Skill getNext_Skill() {
		return next_Skill;
	}
	public void setNext_Skill(Skill next_Skill) {
		this.next_Skill = next_Skill;
	}
	//void method for only print the values alocated to instance variables
	public void print() {
		System.out.println(name);
		System.out.println(optional);
		System.out.println(short_desc);
		System.out.println("Stat_affinity is : "+stat_affinity);
		System.out.println("Rank is : "+ranks);
	
		
	}
	
}
