class BrowseRunner {
    public static void main(String[] args) {
       
        Chrome chrome = new Chrome();
        chrome.setBrowser("Google Chrome");
        System.out.println(chrome.getBrowseInfo());
    }
}
