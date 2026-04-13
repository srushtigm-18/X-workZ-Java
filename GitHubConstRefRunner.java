class GitHubConstRefRunner {

    public static void main(String[] rep) {

        Repository repository = new Repository();
		
        repository.repoId = 5439;
        repository.repoName = "SpringBootEcommerceAPI";
        repository.language = "Java";
        repository.visibility = "Public";
        repository.stars = 320;
        GitHub github = new GitHub(3, repository);
        github.getDetails();


    }
}