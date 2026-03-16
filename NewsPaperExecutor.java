class NewsPaperExecutor {
    public static void main(String[] args) {
        NewsPaper np1 = new NewsPaper();
        np1.paperId = 1; np1.paperName = "The Times of India"; np1.city = "Mumbai"; np1.editor = "Jaideep Bose";
        Article a1 = new Article(); a1.articleId = 101; a1.headline = "Trump's Bold Economic Reforms"; a1.byline = "Rajat Pandit"; a1.category = "Politics"; a1.date = "Mar 15, 2026";
        np1.article = a1; np1.getPaperDetails();

        NewsPaper np2 = new NewsPaper();
        np2.paperId = 2; np2.paperName = "The Hindu"; np2.city = "Chennai"; np2.editor = "Suresh Nambath";
        Article a2 = new Article(); a2.articleId = 102; a2.headline = "ISRO Launches Next Gen Satellite"; a2.byline = "K.S. Sivan"; a2.category = "Science"; a2.date = "Mar 15, 2026";
        np2.article = a2; np2.getPaperDetails();

        NewsPaper np3 = new NewsPaper();
        np3.paperId = 3; np3.paperName = "Indian Express"; np3.city = "Delhi"; np3.editor = "Raj Kamal Jha";
        Article a3 = new Article(); a3.articleId = 103; a3.headline = "Bengaluru IT Boom Continues"; a3.byline = "Shubhomita Das"; a3.category = "Technology"; a3.date = "Mar 15, 2026";
        np3.article = a3; np3.getPaperDetails();

        NewsPaper np4 = new NewsPaper();
        np4.paperId = 4; np4.paperName = "Hindustan Times"; np4.city = "Delhi"; np4.editor = "Sutirtho Patranobis";
        Article a4 = new Article(); a4.articleId = 104; a4.headline = "IPL 2026 Auction Breaks Records"; a4.byline = "Gaurav Kalra"; a4.category = "Sports"; a4.date = "Mar 15, 2026";
        np4.article = a4; np4.getPaperDetails();

        NewsPaper np5 = new NewsPaper();
        np5.paperId = 5; np5.paperName = "Deccan Herald"; np5.city = "Bengaluru"; np5.editor = = "Vijay Shankar";
        Article a5 = new Article(); a5.articleId = 105; a5.headline = "Karnataka Budget Focuses AI"; a5.byline = "Niranjan Kaggwa"; a5.category = "Economy"; a5.date = "Mar 15, 2026";
        np5.article = a5; np5.getPaperDetails();

        NewsPaper np6 = new NewsPaper();
        np6.paperId = 6; np6.paperName = "The New Indian Express"; np6.city = "Chennai"; np6.editor = "Arul J";
        Article a6 = new Article(); a6.articleId = 106; a6.headline = "Monsoon Forecast Early Arrival"; a6.byline = "Shanti Jagannath"; a6.category = "Weather"; a6.date = "Mar 15, 2026";
        np6.article = a6; np6.getPaperDetails();

        NewsPaper np7 = new NewsPaper();
        np7.paperId = 7; np7.paperName = "Economic Times"; np7.city = "Mumbai"; np7.editor = "Ravi Shankar";
        Article a7 = new Article(); a7.articleId = 107; a7.headline = "Nifty Hits 25K Milestone"; a7.byline = "Dhiraj Relli"; a7.category = "Markets"; a7.date = "Mar 15, 2026";
        np7.article = a7; np7.getPaperDetails();

        NewsPaper np8 = new NewsPaper();
        np8.paperId = 8; np8.paperName = "The Telegraph"; np8.city = "Kolkata"; np8.editor = "R. Rajagopal";
        Article a8 = new Article(); a8.articleId = 108; a8.headline = "Bengaluru Metro Phase 3 Approved"; a8.byline = "Karthik M"; a8.category = "Infrastructure"; a8.date = "Mar 15, 2026";
        np8.article = a8; np8.getPaperDetails();

        NewsPaper np9 = new NewsPaper();
        np9.paperId = 9; np9.paperName = "Asian Age"; np9.city = "Delhi"; np9.editor = "M.J. Akbar";
        Article a9 = new Article(); a9.articleId = 109; a9.headline = "AI Revolution Transforms Education"; a9.byline = "Neeta Sharma"; a9.category = "Education"; a9.date = "Mar 15, 2026";
        np9.article = a9; np9.getPaperDetails();

        NewsPaper np10 = new NewsPaper();
        np10.paperId = 10; np10.paperName = "Business Standard"; np10.city = "Mumbai"; np10.editor = "T.N. Ninan";
        Article a10 = new Article(); a10.articleId = 110; a10.headline = "Groww Valuation Crosses $5B"; a10.byline = "Pankaj Mishra"; a10.category = "Startups"; a10.date = "Mar 15, 2026";
        np10.article = a10; np10.getPaperDetails();

        NewsPaper np11 = new NewsPaper();
        np11.paperId = 11; np11.paperName = "The Statesman"; np11.city = "Kolkata"; np11.editor = "Ravindra Kumar";
        Article a11 = new Article(); a11.articleId = 111; a11.headline = "Supreme Court Green Energy Verdict"; a11.byline = "Maneesh Chibber"; a11.category = "Legal"; a11.date = "Mar 15, 2026";
        np11.article = a11; np11.getPaperDetails();

        NewsPaper np12 = new NewsPaper();
        np12.paperId = 12; np12.paperName = "Mid-Day"; np12.city = "Mumbai"; np12.editor = "Ramesh Menon";
        Article a12 = new Article(); a12.articleId = 112; a12.headline = "Bollywood's AI Scriptwriters"; a12.byline = "Mayank Shekhar"; a12.category = "Entertainment"; a12.date = "Mar 15, 2026";
        np12.article = a12; np12.getPaperDetails();

        NewsPaper np13 = new NewsPaper();
        np13.paperId = 13; np13.paperName = "The Pioneer"; np13.city = "Delhi"; np13.editor = "Chandan Mitra";
        Article a13 = new Article(); a13.articleId = 113; a13.headline = "India-US Tech Alliance Signed"; a13.byline = "Atul Aneja"; a13.category = "International"; a13.date = "Mar 15, 2026";
        np13.article = a13; np13.getPaperDetails();

        NewsPaper np14 = new NewsPaper();
        np14.paperId = 14; np14.paperName = "DNA India"; np14.city = "Ahmedabad"; np14.editor = "R. Jagannathan";
        Article a14 = new Article(); a14.articleId = 114; a14.headline = "Electric Vehicle Sales Surge"; a14.byline = "Pankaj Doval"; a14.category = "Auto"; a14.date = "Mar 15, 2026";
        np14.article = a14; np14.getPaperDetails();

        NewsPaper np15 = new NewsPaper();
        np15.paperId = 15; np15.paperName = "The Tribune"; np15.city = "Chandigarh"; np15.editor = "Rajesh Ramachandran";
        Article a15 = new Article(); a15.articleId = 115; a15.headline = "Punjab Agri-Tech Revolution"; a15.byline = "Harish Khare"; a15.category = "Agriculture"; a15.date = "Mar 15, 2026";
        np15.article = a15; np15.getPaperDetails();

        NewsPaper np16 = new NewsPaper();
        np16.paperId = 16; np16.paperName = "The Shillong Times"; np16.city = "Shillong"; np16.editor = "Cushrow Irani";
        Article a16 = new Article(); a16.articleId = 116; a16.headline = "Northeast Tourism Booms"; a16.byline = "Patricia Mukhim"; a16.category = "Tourism"; a16.date = "Mar 15, 2026";
        np16.article = a16; np16.getPaperDetails();

        NewsPaper np17 = new NewsPaper();
        np17.paperId = 17; np17.paperName = "The New York Times (India Ed)"; np17.city = "Delhi"; np17.editor = "Suketu Mehta";
        Article a17 = new Article(); a17.articleId = 117; a17.headline = "India's Quantum Computing Leap"; a17.byline = "Gautam Naik"; a17.category = "Innovation"; a17.date = "Mar 15, 2026";
        np17.article = a17; np17.getPaperDetails();

        NewsPaper np18 = new NewsPaper();
        np18.paperId = 18; np18.paperName = "Financial Express"; np18.city = "Delhi"; np18.editor = = "Udayan Mukherjee";
        Article a18 = new Article(); a18.articleId = 118; a18.headline = "RBI Rate Cut Sparks Rally"; a18.byline = "Lakshmi Iyer"; a18.category = "Finance"; a18.date = "Mar 15, 2026";
        np18.article = a18; np18.getPaperDetails();

        NewsPaper np19 = new NewsPaper();
        np19.paperId = 19; np19.paperName = "The Print"; np19.city = "Delhi"; np19.editor = "Shekhar Gupta";
        Article a19 = new Article(); a19.articleId = 119; a19.headline = "Digital India 3.0 Launched"; a19.byline = = "Nikhil Pahwa"; a19.category = "Digital"; a19.date = "Mar 15, 2026";
        np19.article = a19; np19.getPaperDetails();

        NewsPaper np20 = new NewsPaper();
        np20.paperId = 20; np20.paperName = "Mint"; np20.city = "Mumbai"; np20.editor = "R. Sukumar";
        Article a20 = new Article(); a20.articleId = 120; a20.headline = "Startup Funding Rebounds"; a20.byline = "Shweta Punj"; a20.category = "Business"; a20.date = "Mar 15, 2026";
        np20.article = a20; np20.getPaperDetails();
    }
}
