class GitHub {
    int githubId;
	
    Repository repository;
    
	
    GitHub(int githubId, Repository repository) {
        this.githubId = githubId;
        this.repository = repository;
    }
    
    public void getDetails() {
	
        System.out.println("GitHub id is: " + this.githubId);
        System.out.println("Repository id is: " + this.repository.repoId);
        System.out.println("Repository name is: " + this.repository.repoName);
        System.out.println("Repository language is: " + this.repository.language);
        System.out.println("Repository visibility is: " + this.repository.visibility);
        System.out.println("Repository stars is: " + this.repository.stars);
    }
}