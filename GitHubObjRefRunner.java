class GitHubObjRefRunner {

    public static void main(String[] rep) {

        Repository repository = new Repository();
        GitHub github = new GitHub(1, repository);
        repository.repoId = 1325;
        repository.repoName = "XworkzJavaProjects";
        repository.language = "Java";
        repository.visibility = "Public";
        repository.stars = 150;
        github.getDetails();

    }
}