package truckJob;

public class Job {
	private String jobfrom;
	private String jobDestination;
	private double cost;
	private double weight;
	private double destinationRange;
	private Company company;
	private Truck truck;
	private Dispacher dispacher;
	public Job() {
		super();
	}
	public Job(String jobfrom, String jobDestination, double cost, double weight, double destinationRange) {
		super();
		this.jobfrom = jobfrom;
		this.jobDestination = jobDestination;
		this.cost = cost;
		this.weight = weight;
		this.destinationRange = destinationRange;
	}
	public Job(String jobfrom, String jobDestination, double cost, double weight, double destinationRange,
			Company company, Truck truck, Dispacher dispacher) {
		super();
		this.jobfrom = jobfrom;
		this.jobDestination = jobDestination;
		this.cost = cost;
		this.weight = weight;
		this.destinationRange = destinationRange;
		this.company = company;
		this.truck = truck;
		this.dispacher = dispacher;
	}
	public String getJobfrom() {
		return jobfrom;
	}
	public void setJobfrom(String jobfrom) {
		this.jobfrom = jobfrom;
	}
	public String getJobDestination() {
		return jobDestination;
	}
	public void setJobDestination(String jobDestination) {
		this.jobDestination = jobDestination;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getDestinationRange() {
		return destinationRange;
	}
	public void setDestinationRange(double destinationRange) {
		this.destinationRange = destinationRange;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Truck getTruck() {
		return truck;
	}
	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	public Dispacher getDispacher() {
		return dispacher;
	}
	public void setDispacher(Dispacher dispacher) {
		this.dispacher = dispacher;
	}
	
	
}
