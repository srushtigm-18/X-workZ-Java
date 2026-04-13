class GitHubMethodRefRunner {

    public static void main(String[] proj) {
	

        Repository repository = new Repository();
        repository.repoId = 3256;
        repository.repoName = "EcommerceReactApp";
        repository.language = "JavaScript";
        repository.visibility = "Private";
        repository.stars = 85;
        GitHub github = new GitHub(2, repository);
        github.getDetails();

    }
}