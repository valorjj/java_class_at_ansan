module Member_Board_Project {

	requires activation;
	requires mail;

	opens controller to activation, mail;
}