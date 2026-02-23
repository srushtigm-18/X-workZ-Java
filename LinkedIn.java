class LinkedIn {
    public static String[] searchJobsByCompany(String companyName) {
        System.out.println("invoked searchJobsByCompany");

        if (companyName=="Google") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer", 
                "Engineering Manager", "Product Manager", "Technical Program Manager",
                "Data Scientist", "Machine Learning Engineer", "Cloud Architect",
                "DevOps Engineer", "Security Engineer", "Site Reliability Engineer",
                "Android Developer", "iOS Developer", "Frontend Engineer",
                "Backend Engineer", "Full Stack Developer", "QA Engineer",
                "Technical Writer", "UX Designer", "Solutions Architect"
            };
            System.out.println("Google jobs found");
            return jobs;
        } 
        else if (companyName=="Microsoft") {
            String[] jobs = {
                "Software Development Engineer", "Senior SDE", "Principal SDE",
                "Engineering Manager", "Program Manager", "Product Manager",
                "Data & Applied Scientist", "Machine Learning Engineer",
                "Azure Cloud Engineer", "DevOps Engineer", "Security Engineer",
                "Windows Developer", "Office Developer", "Power Platform Developer",
                "Full Stack Engineer", "Frontend Developer", "Backend Developer",
                "Test Engineer", "Technical Evangelist", "UX Researcher"
            };
            System.out.println("Microsoft jobs found");
            return jobs;
        }
        else if (companyName=="Amazon") {
            String[] jobs = {
                "Software Development Engineer I", "SDE II", "Senior SDE",
                "SDE Manager", "Product Manager-Technical", "Technical Program Manager",
                "Data Scientist", "Applied Scientist", "Machine Learning Scientist",
                "Solutions Architect", "Cloud Support Engineer", "DevOps Engineer",
                "Security Engineer", "Android SDE", "iOS SDE",
                "Frontend Engineer", "Backend Engineer", "Fullstack SDE",
                "SDET", "Business Intelligence Engineer", "TPM L6"
            };
            System.out.println("Amazon jobs found");
            return jobs;
        }
        else if (companyName=="Meta") {
            String[] jobs = {
                "Software Engineer", "E3 Software Engineer", "E4 Software Engineer",
                "Engineering Manager", "Product Manager", "Technical Program Manager",
                "Data Scientist", "Machine Learning Engineer", "Research Scientist",
                "Infrastructure Engineer", "Production Engineer", "Security Engineer",
                "Android Engineer", "iOS Engineer", "React Native Engineer",
                "Frontend Engineer", "Backend Engineer", "Full Stack Engineer",
                "Software Engineer in Test", "People Engineer", "Technical Lead"
            };
            System.out.println("Meta jobs found");
            return jobs;
        }
        else if (companyName=="Apple") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "ICT3 Software Engineer",
                "Engineering Manager", "Hardware Engineer", "ASIC Design Engineer",
                "Machine Learning Engineer", "Computer Vision Engineer",
                "iOS Software Engineer", "macOS Engineer", "watchOS Engineer",
                "Siri Engineer", "ARKit Engineer", "Metal Engineer",
                "Frontend Engineer", "Backend Engineer", "Full Stack Developer",
                "QA Engineer", "DevOps Engineer", "Security Engineer"
            };
            System.out.println("Apple jobs found");
            return jobs;
        }
        else if (companyName=="Netflix") {
            String[] jobs = {
                "Senior Software Engineer", "Staff Software Engineer", "Principal Engineer",
                "Engineering Manager", "Content Engineer", "Data Platform Engineer",
                "Senior Data Scientist", "Machine Learning Engineer",
                "Streaming Engineer", "Android Engineer", "iOS Engineer",
                "Frontend Engineer", "Full Stack Engineer", "Backend Engineer",
                "Site Reliability Engineer", "Security Engineer",
                "Performance Engineer", "QA Engineer", "DevOps Engineer",
                "Senior UI Engineer"
            };
            System.out.println("Netflix jobs found");
            return jobs;
        }
        else if (companyName=="Uber") {
            String[] jobs = {
                "Software Engineer II", "Senior Software Engineer", "Staff Software Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Applied Scientist",
                "Platform Engineer", "Mobile Engineer", "Android Engineer",
                "iOS Engineer", "Maps Engineer", "Pricing Engineer",
                "Full Stack Engineer", "Backend Engineer", "Frontend Engineer",
                "Security Engineer", "DevOps Engineer", "Reliability Engineer"
            };
            System.out.println("Uber jobs found");
            return jobs;
        }
        else if (companyName=="Airbnb") {
            String[] jobs = {
                "Senior Software Engineer", "Staff Software Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Staff Machine Learning Engineer",
                "iOS Engineer", "Android Engineer", "Frontend Engineer",
                "Backend Engineer", "Full Stack Engineer", "Maps Engineer",
                "Search Engineer", "Payments Engineer", "Security Engineer",
                "Infrastructure Engineer", "Data Engineer", "Experimentation Engineer"
            };
            System.out.println("Airbnb jobs found");
            return jobs;
        }
        else if (companyName=="Salesforce") {
            String[] jobs = {
                "Software Engineer 2", "Senior Software Engineer", "Principal Engineer",
                "Member of Technical Staff", "Engineering Manager", "Product Manager",
                "Data Scientist", "Machine Learning Engineer", "MTS",
                "Lightning Platform Developer", "Apex Developer", "LWC Developer",
                "Full Stack Developer", "Backend Developer", "Frontend Developer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Technical Architect"
            };
            System.out.println("Salesforce jobs found");
            return jobs;
        }
        else if (companyName=="Oracle") {
            String[] jobs = {
                "Software Engineer 2", "Senior Software Engineer", "Principal Software Engineer",
                "Engineering Manager", "Product Manager", "Cloud Engineer",
                "Database Engineer", "Java Developer", "Full Stack Developer",
                "Frontend Engineer", "Backend Engineer", "DevOps Engineer",
                "Security Consultant", "Data Engineer", "Data Scientist",
                "Machine Learning Engineer", "Solutions Architect",
                "Technical Support Engineer", "QA Engineer"
            };
            System.out.println("Oracle jobs found");
            return jobs;
        }
        else if (companyName=="IBM") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Lead Software Engineer",
                "Engineering Manager", "Consulting Software Engineer", "Data Scientist",
                "Machine Learning Engineer", "Watson Developer", "Cloud Engineer",
                "Full Stack Developer", "Java Developer", "Node.js Developer",
                "DevOps Engineer", "Security Engineer", "Cybersecurity Analyst",
                "Blockchain Developer", "Quantum Computing Researcher",
                "Solutions Architect", "Technical Lead"
            };
            System.out.println("IBM jobs found");
            return jobs;
        }
        else if (companyName=="Tesla") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer",
                "Autopilot Engineer", "Computer Vision Engineer", "AI/ML Engineer",
                "Embedded Software Engineer", "Firmware Engineer", "Vehicle Software Engineer",
                "Full Self-Driving Engineer", "Infotainment Engineer",
                "Backend Engineer", "DevOps Engineer", "Data Engineer",
                "QA Engineer", "Security Engineer", "Powertrain Software Engineer",
                "Manufacturing Engineer", "Test Engineer"
            };
            System.out.println("Tesla jobs found");
            return jobs;
        }
        else if (companyName=="Adobe") {
            String[] jobs = {
                "Software Engineer I", "Software Engineer II", "Senior Software Engineer",
                "Computer Scientist", "Engineering Manager", "Product Manager",
                "Data Scientist", "Machine Learning Engineer", "Research Scientist",
                "Creative Cloud Engineer", "Experience Cloud Engineer",
                "Document Cloud Engineer", "Frontend Engineer", "Backend Engineer",
                "Full Stack Engineer", "DevOps Engineer", "Security Engineer",
                "QA Engineer", "UX Engineer"
            };
            System.out.println("Adobe jobs found");
            return jobs;
        }
        else if (companyName=="SAP") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Principal Software Engineer",
                "Development Architect", "Engineering Manager", "ABAP Developer",
                "SAP Fiori Developer", "SAPUI5 Developer", "S/4HANA Consultant",
                "Full Stack Developer", "Java Developer", "Cloud Developer",
                "Data Scientist", "Machine Learning Engineer", "DevOps Engineer",
                "Security Consultant", "Solutions Architect", "Technical Consultant"
            };
            System.out.println("SAP jobs found");
            return jobs;
        }
        else if (companyName=="VMware") {
            String[] jobs = {
                "Software Engineer", "Staff Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "Virtualization Engineer",
                "Cloud Native Engineer", "Kubernetes Engineer", "Tanzu Developer",
                "Full Stack Developer", "Backend Developer", "Frontend Developer",
                "DevOps Engineer", "Site Reliability Engineer", "Security Engineer",
                "Data Engineer", "Machine Learning Engineer", "Solutions Architect"
            };
            System.out.println("VMware jobs found");
            return jobs;
        }
        else if (companyName=="ServiceNow") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer",
                "Engineering Manager", "Product Manager", "Platform Engineer",
                "Full Stack Developer", "UI Developer", "Backend Developer",
                "DevOps Engineer", "Security Engineer", "Data Engineer",
                "Machine Learning Engineer", "Solutions Architect",
                "Technical Consultant", "Product Analyst", "QA Engineer"
            };
            System.out.println("ServiceNow jobs found");
            return jobs;
        }
        else if (companyName=="Workday") {
            String[] jobs = {
                "Software Engineer II", "Senior Software Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "HCM Product Engineer",
                "Financials Engineer", "Full Stack Engineer", "Backend Engineer",
                "Frontend Engineer", "DevOps Engineer", "Security Engineer",
                "Data Engineer", "Machine Learning Engineer", "QA Engineer",
                "Solutions Architect", "Technical Consultant"
            };
            System.out.println("Workday jobs found");
            return jobs;
        }
        
        else if (companyName=="Stripe") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "Engineering Manager", "Product Manager", "Payments Engineer",
                "Risk Engineer", "Machine Learning Engineer", "Backend Engineer",
                "Full Stack Engineer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Data Scientist", "Solutions Architect"
            };
            System.out.println("Stripe jobs found");
            return jobs;
        }
        else if (companyName=="Snowflake") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "Engineering Manager", "Product Manager", "Data Platform Engineer",
                "Cloud Engineer", "Full Stack Developer", "Backend Developer",
                "Security Engineer", "Solutions Architect", "Data Scientist"
            };
            System.out.println("Snowflake jobs found");
            return jobs;
        }
        else if (companyName=="Databricks") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "ML Platform Engineer", "Data Engineer", "Spark Developer",
                "Full Stack Engineer", "Backend Engineer", "DevOps Engineer"
            };
            System.out.println("Databricks jobs found");
            return jobs;
        }else if (companyName=="NVIDIA") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "GPU Software Engineer",
                "Engineering Manager", "AI Research Engineer", "CUDA Developer",
                "Machine Learning Engineer", "Deep Learning Engineer", "Graphics Engineer",
                "Driver Developer", "Embedded Software Engineer", "Firmware Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Scientist",
                "Computer Vision Engineer", "Performance Engineer", "QA Engineer",
                "Security Engineer", "Systems Architect"
            };
            System.out.println("NVIDIA jobs found");
            return jobs;
        }
        else if (companyName=="OpenAI") {
            String[] jobs = {
                "Software Engineer", "Research Engineer", "ML Engineer",
                "Engineering Manager", "Product Manager", "AI Safety Engineer",
                "Machine Learning Researcher", "Backend Engineer", "Infrastructure Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Engineer",
                "Prompt Engineer", "Applied Scientist", "Security Engineer",
                "Site Reliability Engineer", "QA Engineer", "Technical Lead",
                "Solutions Architect", "Ethics Engineer"
            };
            System.out.println("OpenAI jobs found");
            return jobs;
        }
        else if (companyName=="Cisco") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Network Software Engineer",
                "Engineering Manager", "Product Manager", "Security Engineer",
                "DevOps Engineer", "Cloud Engineer", "Full Stack Developer",
                "Backend Engineer", "Frontend Engineer", "Embedded Engineer",
                "Data Scientist", "Machine Learning Engineer", "QA Engineer",
                "Site Reliability Engineer", "Solutions Architect", "Technical Support Engineer",
                "Cybersecurity Analyst", "Systems Engineer"
            };
            System.out.println("Cisco jobs found");
            return jobs;
        }
        else if (companyName=="GitLab") {
            String[] jobs = {
                "Software Engineer", "Backend Engineer", "Frontend Engineer",
                "Engineering Manager", "Product Manager", "DevOps Engineer",
                "Full Stack Developer", "Security Engineer", "QA Engineer",
                "Infrastructure Engineer", "Data Engineer", "Machine Learning Engineer",
                "Ruby Developer", "Go Engineer", "Site Reliability Engineer",
                "UX Engineer", "Technical Writer", "Release Engineer",
                "Platform Engineer", "Solutions Architect"
            };
            System.out.println("GitLab jobs found");
            return jobs;
        }
        else if (companyName=="Intel") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Firmware Engineer",
                "Engineering Manager", "Hardware Software Engineer", "AI Engineer",
                "Machine Learning Engineer", "Embedded Developer", "Driver Developer",
                "Full Stack Engineer", "DevOps Engineer", "Data Scientist",
                "Performance Engineer", "QA Engineer", "Security Engineer",
                "Systems Architect", "Cloud Engineer", "Graphics Software Engineer",
                "Validation Engineer", "Technical Lead"
            };
            System.out.println("Intel jobs found");
            return jobs;
        }
        else if (companyName=="Qualcomm") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Modem Software Engineer",
                "Engineering Manager", "Chipset Software Developer", "5G Engineer",
                "Machine Learning Engineer", "Embedded Engineer", "Android Engineer",
                "Full Stack Developer", "DevOps Engineer", "QA Engineer",
                "Security Engineer", "Multimedia Engineer", "Camera Software Engineer",
                "Driver Developer", "Systems Engineer", "Firmware Engineer",
                "Protocol Engineer", "Solutions Architect"
            };
            System.out.println("Qualcomm jobs found");
            return jobs;
        }
        else if (companyName=="PayPal") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "Risk Engineer",
                "Machine Learning Engineer", "Fraud Detection Engineer", "Backend Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Scientist",
                "Security Engineer", "Mobile Developer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Blockchain Engineer", "Solutions Architect"
            };
            System.out.println("PayPal jobs found");
            return jobs;
        }
        else if (companyName=="Atlassian") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Platform Engineer",
                "Engineering Manager", "Product Manager", "Cloud Engineer",
                "Full Stack Developer", "Backend Engineer", "Frontend Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Data Engineer", "Machine Learning Engineer", "Jira Developer",
                "Confluence Engineer", "Scalability Engineer", "Technical Lead",
                "Infrastructure Engineer", "Solutions Architect"
            };
            System.out.println("Atlassian jobs found");
            return jobs;
        }
        else if (companyName=="Twilio") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Communications Platform Engineer",
                "Engineering Manager", "Product Manager", "API Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Voice Engineer", "Messaging Engineer",
                "Scalability Engineer", "Solutions Architect"
            };
            System.out.println("Twilio jobs found");
            return jobs;
        }

        else if (companyName=="DoorDash") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Delivery Platform Engineer",
                "Engineering Manager", "Product Manager", "Machine Learning Engineer",
                "Backend Engineer", "Full Stack Developer", "Android Engineer",
                "iOS Engineer", "DevOps Engineer", "Data Scientist",
                "Maps Engineer", "Payments Engineer", "Security Engineer",
                "QA Engineer", "Logistics Engineer", "Frontend Engineer",
                "Site Reliability Engineer", "Solutions Architect"
            };
            System.out.println("DoorDash jobs found");
            return jobs;
        }
        else if (companyName=="Spotify") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Music Platform Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Backend Engineer", "Android Developer",
                "iOS Developer", "Full Stack Engineer", "DevOps Engineer",
                "Security Engineer", "Recommendation Engineer", "QA Engineer",
                "Frontend Engineer", "Streaming Engineer", "Personalization Engineer",
                "Podcast Engineer", "Solutions Architect"
            };
            System.out.println("Spotify jobs found");
            return jobs;
        }
        else if (companyName=="Square") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "POS Developer",
                "Machine Learning Engineer", "Risk Engineer", "Backend Engineer",
                "Full Stack Developer", "Mobile Engineer", "DevOps Engineer",
                "Security Engineer", "Data Engineer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Hardware Software Engineer", "Solutions Architect"
            };
            System.out.println("Square jobs found");
            return jobs;
        }
        else if (companyName=="Dropbox") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Storage Engineer",
                "Engineering Manager", "Product Manager", "Sync Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Cloud Engineer", "Sharing Engineer",
                "Collaboration Engineer", "Solutions Architect"
            };
            System.out.println("Dropbox jobs found");
            return jobs;
        }
        else if (companyName=="Slack") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Collaboration Platform Engineer",
                "Engineering Manager", "Product Manager", "Backend Engineer",
                "Full Stack Developer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Integrations Engineer", "Machine Learning Engineer",
                "Mobile Developer", "QA Engineer", "Search Engineer",
                "Notifications Engineer", "API Engineer", "Scalability Engineer",
                "UX Engineer", "Solutions Architect"
            };
            System.out.println("Slack jobs found");
            return jobs;
        }
        else if (companyName=="Zoom") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Video Platform Engineer",
                "Engineering Manager", "Product Manager", "Real-time Engineer",
                "Backend Engineer", "Frontend Engineer", "Mobile Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Machine Learning Engineer", "Streaming Engineer", "WebRTC Developer",
                "Full Stack Developer", "Infrastructure Engineer", "Reliability Engineer",
                "Data Engineer", "Solutions Architect"
            };
            System.out.println("Zoom jobs found");
            return jobs;
        }
        else if (companyName=="Palantir") {
            String[] jobs = {
                "Software Engineer", "Forward Deployed Engineer", "Backend Engineer",
                "Engineering Manager", "Data Engineer", "Machine Learning Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Deployment Engineer", "Analytics Engineer", "Pipeline Engineer",
                "Graph Engineer", "QA Engineer", "Infrastructure Engineer",
                "Solutions Architect", "Product Engineer", "Technical Lead",
                "Big Data Engineer", "AI Engineer"
            };
            System.out.println("Palantir jobs found");
            return jobs;
        }
        else if (companyName=="MongoDB") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Database Engineer",
                "Engineering Manager", "Product Manager", "Kernel Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Atlas Engineer", "Query Optimizer", "Sharding Engineer",
                "Data Platform Engineer", "Machine Learning Engineer", "QA Engineer",
                "Performance Engineer", "Cloud Engineer", "Driver Developer",
                "Technical Evangelist", "Solutions Architect"
            };
            System.out.println("MongoDB jobs found");
            return jobs;
        }
        else if (companyName=="Redis") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Caching Engineer",
                "Engineering Manager", "Product Manager", "Core Developer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "Modules Engineer",
                "Performance Engineer", "QA Engineer", "Infrastructure Engineer",
                "Data Structures Engineer", "Search Engineer", "Graph Engineer",
                "Time Series Engineer", "Solutions Architect"
            };
            System.out.println("Redis jobs found");
            return jobs;
        }
        else if (companyName=="HashiCorp") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "IaC Engineer",
                "Engineering Manager", "Product Manager", "Terraform Developer",
                "Vault Engineer", "Consul Engineer", "Nomad Engineer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "QA Engineer",
                "Provider Developer", "API Engineer", "Operator Engineer",
                "Reliability Engineer", "Solutions Architect"
            };
            System.out.println("HashiCorp jobs found");
            return jobs;
        }
		
		
		
		
		else if (companyName=="AMD") {
            String[] jobs = {
                "Software Development Engineer", "Senior SDE", "Principal SDE",
                "Engineering Manager", "Program Manager", "Product Manager",
                "Data & Applied Scientist", "Machine Learning Engineer",
                "Azure Cloud Engineer", "DevOps Engineer", "Security Engineer",
                "Windows Developer", "Office Developer", "Power Platform Developer",
                "Full Stack Engineer", "Frontend Developer", "Backend Developer",
                "Test Engineer", "Technical Evangelist", "UX Researcher"
            };
            System.out.println("AMD jobs found");
            return jobs;
        }
        else if (companyName=="Lyft") {
            String[] jobs = {
                "Software Development Engineer I", "SDE II", "Senior SDE",
                "SDE Manager", "Product Manager-Technical", "Technical Program Manager",
                "Data Scientist", "Applied Scientist", "Machine Learning Scientist",
                "Solutions Architect", "Cloud Support Engineer", "DevOps Engineer",
                "Security Engineer", "Android SDE", "iOS SDE",
                "Frontend Engineer", "Backend Engineer", "Fullstack SDE",
                "SDET", "Business Intelligence Engineer", "TPM L6"
            };
            System.out.println("Lyft jobs found");
            return jobs;
        }
        else if (companyName=="Cruise") {
            String[] jobs = {
                "Software Engineer", "E3 Software Engineer", "E4 Software Engineer",
                "Engineering Manager", "Product Manager", "Technical Program Manager",
                "Data Scientist", "Machine Learning Engineer", "Research Scientist",
                "Infrastructure Engineer", "Production Engineer", "Security Engineer",
                "Android Engineer", "iOS Engineer", "React Native Engineer",
                "Frontend Engineer", "Backend Engineer", "Full Stack Engineer",
                "Software Engineer in Test", "People Engineer", "Technical Lead"
            };
            System.out.println("Cruise jobs found");
            return jobs;
        }
        else if (companyName=="Waymo") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "ICT3 Software Engineer",
                "Engineering Manager", "Hardware Engineer", "ASIC Design Engineer",
                "Machine Learning Engineer", "Computer Vision Engineer",
                "iOS Software Engineer", "macOS Engineer", "watchOS Engineer",
                "Siri Engineer", "ARKit Engineer", "Metal Engineer",
                "Frontend Engineer", "Backend Engineer", "Full Stack Developer",
                "QA Engineer", "DevOps Engineer", "Security Engineer"
            };
            System.out.println("Waymo jobs found");
            return jobs;
        }
        else if (companyName=="Figma") {
            String[] jobs = {
                "Senior Software Engineer", "Staff Software Engineer", "Principal Engineer",
                "Engineering Manager", "Content Engineer", "Data Platform Engineer",
                "Senior Data Scientist", "Machine Learning Engineer",
                "Streaming Engineer", "Android Engineer", "iOS Engineer",
                "Frontend Engineer", "Full Stack Engineer", "Backend Engineer",
                "Site Reliability Engineer", "Security Engineer",
                "Performance Engineer", "QA Engineer", "DevOps Engineer",
                "Senior UI Engineer"
            };
            System.out.println("Figma jobs found");
            return jobs;
        }
        else if (companyName=="Notion") {
            String[] jobs = {
                "Software Engineer II", "Senior Software Engineer", "Staff Software Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Applied Scientist",
                "Platform Engineer", "Mobile Engineer", "Android Engineer",
                "iOS Engineer", "Maps Engineer", "Pricing Engineer",
                "Full Stack Engineer", "Backend Engineer", "Frontend Engineer",
                "Security Engineer", "DevOps Engineer", "Reliability Engineer"
            };
            System.out.println("Notion jobs found");
            return jobs;
        }
        else if (companyName=="Rippling") {
            String[] jobs = {
                "Senior Software Engineer", "Staff Software Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Staff Machine Learning Engineer",
                "iOS Engineer", "Android Engineer", "Frontend Engineer",
                "Backend Engineer", "Full Stack Engineer", "Maps Engineer",
                "Search Engineer", "Payments Engineer", "Security Engineer",
                "Infrastructure Engineer", "Data Engineer", "Experimentation Engineer"
            };
            System.out.println("Rippling jobs found");
            return jobs;
        }
        else if (companyName=="Plaid") {
            String[] jobs = {
                "Software Engineer 2", "Senior Software Engineer", "Principal Engineer",
                "Member of Technical Staff", "Engineering Manager", "Product Manager",
                "Data Scientist", "Machine Learning Engineer", "MTS",
                "Lightning Platform Developer", "Apex Developer", "LWC Developer",
                "Full Stack Developer", "Backend Developer", "Frontend Developer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Technical Architect"
            };
            System.out.println("Plaid jobs found");
            return jobs;
        }
        else if (companyName=="Datadog") {
            String[] jobs = {
                "Software Engineer 2", "Senior Software Engineer", "Principal Software Engineer",
                "Engineering Manager", "Product Manager", "Cloud Engineer",
                "Database Engineer", "Java Developer", "Full Stack Developer",
                "Frontend Engineer", "Backend Engineer", "DevOps Engineer",
                "Security Consultant", "Data Engineer", "Data Scientist",
                "Machine Learning Engineer", "Solutions Architect",
                "Technical Support Engineer", "QA Engineer"
            };
            System.out.println("Datadog jobs found");
            return jobs;
        }
        else if (companyName=="Okta") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Lead Software Engineer",
                "Engineering Manager", "Consulting Software Engineer", "Data Scientist",
                "Machine Learning Engineer", "Watson Developer", "Cloud Engineer",
                "Full Stack Developer", "Java Developer", "Node.js Developer",
                "DevOps Engineer", "Security Engineer", "Cybersecurity Analyst",
                "Blockchain Developer", "Quantum Computing Researcher",
                "Solutions Architect", "Technical Lead"
            };
            System.out.println("Okta jobs found");
            return jobs;
        }
        else if (companyName=="Cloudflare") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer",
                "Autopilot Engineer", "Computer Vision Engineer", "AI/ML Engineer",
                "Embedded Software Engineer", "Firmware Engineer", "Vehicle Software Engineer",
                "Full Self-Driving Engineer", "Infotainment Engineer",
                "Backend Engineer", "DevOps Engineer", "Data Engineer",
                "QA Engineer", "Security Engineer", "Powertrain Software Engineer",
                "Manufacturing Engineer", "Test Engineer"
            };
            System.out.println("Cloudflare jobs found");
            return jobs;
        }
        else if (companyName=="Fastly") {
            String[] jobs = {
                "Software Engineer I", "Software Engineer II", "Senior Software Engineer",
                "Computer Scientist", "Engineering Manager", "Product Manager",
                "Data Scientist", "Machine Learning Engineer", "Research Scientist",
                "Creative Cloud Engineer", "Experience Cloud Engineer",
                "Document Cloud Engineer", "Frontend Engineer", "Backend Engineer",
                "Full Stack Engineer", "DevOps Engineer", "Security Engineer",
                "QA Engineer", "UX Engineer"
            };
            System.out.println("Fastly jobs found");
            return jobs;
        }
        else if (companyName=="Cockroach Labs") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Principal Software Engineer",
                "Development Architect", "Engineering Manager", "ABAP Developer",
                "Cockroach Labs Fiori Developer", "SAPUI5 Developer", "S/4HANA Consultant",
                "Full Stack Developer", "Java Developer", "Cloud Developer",
                "Data Scientist", "Machine Learning Engineer", "DevOps Engineer",
                "Security Consultant", "Solutions Architect", "Technical Consultant"
            };
            System.out.println("Cockroach Labs jobs found");
            return jobs;
        }
        else if (companyName=="Confluent") {
            String[] jobs = {
                "Software Engineer", "Staff Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "Virtualization Engineer",
                "Cloud Native Engineer", "Kubernetes Engineer", "Tanzu Developer",
                "Full Stack Developer", "Backend Developer", "Frontend Developer",
                "DevOps Engineer", "Site Reliability Engineer", "Security Engineer",
                "Data Engineer", "Machine Learning Engineer", "Solutions Architect"
            };
            System.out.println("Confluent jobs found");
            return jobs;
        }
        else if (companyName=="Elastic") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer",
                "Engineering Manager", "Product Manager", "Platform Engineer",
                "Full Stack Developer", "UI Developer", "Backend Developer",
                "DevOps Engineer", "Security Engineer", "Data Engineer",
                "Machine Learning Engineer", "Solutions Architect",
                "Technical Consultant", "Product Analyst", "QA Engineer"
            };
            System.out.println("Elastic jobs found");
            return jobs;
        }
        else if (companyName=="New Relic") {
            String[] jobs = {
                "Software Engineer II", "Senior Software Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "HCM Product Engineer",
                "Financials Engineer", "Full Stack Engineer", "Backend Engineer",
                "Frontend Engineer", "DevOps Engineer", "Security Engineer",
                "Data Engineer", "Machine Learning Engineer", "QA Engineer",
                "Solutions Architect", "Technical Consultant"
            };
            System.out.println("New Relic jobs found");
            return jobs;
        }
        
        else if (companyName=="Splunk") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "Engineering Manager", "Product Manager", "Payments Engineer",
                "Risk Engineer", "Machine Learning Engineer", "Backend Engineer",
                "Full Stack Engineer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Data Scientist", "Solutions Architect"
            };
            System.out.println("Splunk jobs found");
            return jobs;
        }
        else if (companyName=="AppDynamics") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "Engineering Manager", "Product Manager", "Data Platform Engineer",
                "Cloud Engineer", "Full Stack Developer", "Backend Developer",
                "Security Engineer", "Solutions Architect", "Data Scientist"
            };
            System.out.println("AppDynamics jobs found");
            return jobs;
        }
        else if (companyName=="PagerDuty") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "ML Platform Engineer", "Data Engineer", "Spark Developer",
                "Full Stack Engineer", "Backend Engineer", "DevOps Engineer"
            };
            System.out.println("PagerDuty jobs found");
            return jobs;
        }else if (companyName=="SendGrid") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "GPU Software Engineer",
                "Engineering Manager", "AI Research Engineer", "CUDA Developer",
                "Machine Learning Engineer", "Deep Learning Engineer", "Graphics Engineer",
                "Driver Developer", "Embedded Software Engineer", "Firmware Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Scientist",
                "Computer Vision Engineer", "Performance Engineer", "QA Engineer",
                "Security Engineer", "Systems Architect"
            };
            System.out.println("SendGrid jobs found");
            return jobs;
        }
        else if (companyName=="Intercom") {
            String[] jobs = {
                "Software Engineer", "Research Engineer", "ML Engineer",
                "Engineering Manager", "Product Manager", "AI Safety Engineer",
                "Machine Learning Researcher", "Backend Engineer", "Infrastructure Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Engineer",
                "Prompt Engineer", "Applied Scientist", "Security Engineer",
                "Site Reliability Engineer", "QA Engineer", "Technical Lead",
                "Solutions Architect", "Ethics Engineer"
            };
            System.out.println("Intercom jobs found");
            return jobs;
        }
        else if (companyName=="Segment") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Network Software Engineer",
                "Engineering Manager", "Product Manager", "Security Engineer",
                "DevOps Engineer", "Cloud Engineer", "Full Stack Developer",
                "Backend Engineer", "Frontend Engineer", "Embedded Engineer",
                "Data Scientist", "Machine Learning Engineer", "QA Engineer",
                "Site Reliability Engineer", "Solutions Architect", "Technical Support Engineer",
                "Cybersecurity Analyst", "Systems Engineer"
            };
            System.out.println("Segment jobs found");
            return jobs;
        }
        else if (companyName=="Mixpanel") {
            String[] jobs = {
                "Software Engineer", "Backend Engineer", "Frontend Engineer",
                "Engineering Manager", "Product Manager", "DevOps Engineer",
                "Full Stack Developer", "Security Engineer", "QA Engineer",
                "Infrastructure Engineer", "Data Engineer", "Machine Learning Engineer",
                "Ruby Developer", "Go Engineer", "Site Reliability Engineer",
                "UX Engineer", "Technical Writer", "Release Engineer",
                "Platform Engineer", "Solutions Architect"
            };
            System.out.println("Mixpanel jobs found");
            return jobs;
        }
        else if (companyName=="Amplitude") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Firmware Engineer",
                "Engineering Manager", "Hardware Software Engineer", "AI Engineer",
                "Machine Learning Engineer", "Embedded Developer", "Driver Developer",
                "Full Stack Engineer", "DevOps Engineer", "Data Scientist",
                "Performance Engineer", "QA Engineer", "Security Engineer",
                "Systems Architect", "Cloud Engineer", "Graphics Software Engineer",
                "Validation Engineer", "Technical Lead"
            };
            System.out.println("Amplitude jobs found");
            return jobs;
        }
        else if (companyName=="PostHog") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Modem Software Engineer",
                "Engineering Manager", "Chipset Software Developer", "5G Engineer",
                "Machine Learning Engineer", "Embedded Engineer", "Android Engineer",
                "Full Stack Developer", "DevOps Engineer", "QA Engineer",
                "Security Engineer", "Multimedia Engineer", "Camera Software Engineer",
                "Driver Developer", "Systems Engineer", "Firmware Engineer",
                "Protocol Engineer", "Solutions Architect"
            };
            System.out.println("PostHog jobs found");
            return jobs;
        }
        else if (companyName=="Airtable") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "Risk Engineer",
                "Machine Learning Engineer", "Fraud Detection Engineer", "Backend Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Scientist",
                "Security Engineer", "Mobile Developer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Blockchain Engineer", "Solutions Architect"
            };
            System.out.println("Airtable jobs found");
            return jobs;
        }
        else if (companyName=="Coda") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Platform Engineer",
                "Engineering Manager", "Product Manager", "Cloud Engineer",
                "Full Stack Developer", "Backend Engineer", "Frontend Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Data Engineer", "Machine Learning Engineer", "Jira Developer",
                "Confluence Engineer", "Scalability Engineer", "Technical Lead",
                "Infrastructure Engineer", "Solutions Architect"
            };
            System.out.println("Coda jobs found");
            return jobs;
        }
        else if (companyName=="Webflow") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Communications Platform Engineer",
                "Engineering Manager", "Product Manager", "API Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Voice Engineer", "Messaging Engineer",
                "Scalability Engineer", "Solutions Architect"
            };
            System.out.println("Webflow jobs found");
            return jobs;
        }

        else if (companyName=="Bubble") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Delivery Platform Engineer",
                "Engineering Manager", "Product Manager", "Machine Learning Engineer",
                "Backend Engineer", "Full Stack Developer", "Android Engineer",
                "iOS Engineer", "DevOps Engineer", "Data Scientist",
                "Maps Engineer", "Payments Engineer", "Security Engineer",
                "QA Engineer", "Logistics Engineer", "Frontend Engineer",
                "Site Reliability Engineer", "Solutions Architect"
            };
            System.out.println("Bubble jobs found");
            return jobs;
        }
        else if (companyName=="Zapier") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Music Platform Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Backend Engineer", "Android Developer",
                "iOS Developer", "Full Stack Engineer", "DevOps Engineer",
                "Security Engineer", "Recommendation Engineer", "QA Engineer",
                "Frontend Engineer", "Streaming Engineer", "Personalization Engineer",
                "Podcast Engineer", "Solutions Architect"
            };
            System.out.println("Zapier jobs found");
            return jobs;
        }
        else if (companyName=="Calendly") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "POS Developer",
                "Machine Learning Engineer", "Risk Engineer", "Backend Engineer",
                "Full Stack Developer", "Mobile Engineer", "DevOps Engineer",
                "Security Engineer", "Data Engineer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Hardware Software Engineer", "Solutions Architect"
            };
            System.out.println("Calendly jobs found");
            return jobs;
        }
        else if (companyName=="Typeform") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Storage Engineer",
                "Engineering Manager", "Product Manager", "Sync Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Cloud Engineer", "Sharing Engineer",
                "Collaboration Engineer", "Solutions Architect"
            };
            System.out.println("Typeform jobs found");
            return jobs;
        }
        else if (companyName=="Canva") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Collaboration Platform Engineer",
                "Engineering Manager", "Product Manager", "Backend Engineer",
                "Full Stack Developer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Integrations Engineer", "Machine Learning Engineer",
                "Mobile Developer", "QA Engineer", "Search Engineer",
                "Notifications Engineer", "API Engineer", "Scalability Engineer",
                "UX Engineer", "Solutions Architect"
            };
            System.out.println("Canva jobs found");
            return jobs;
        }
        else if (companyName=="InVision") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Video Platform Engineer",
                "Engineering Manager", "Product Manager", "Real-time Engineer",
                "Backend Engineer", "Frontend Engineer", "Mobile Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Machine Learning Engineer", "Streaming Engineer", "WebRTC Developer",
                "Full Stack Developer", "Infrastructure Engineer", "Reliability Engineer",
                "Data Engineer", "Solutions Architect"
            };
            System.out.println("InVision jobs found");
            return jobs;
        }
        else if (companyName=="Figma") {
            String[] jobs = {
                "Software Engineer", "Forward Deployed Engineer", "Backend Engineer",
                "Engineering Manager", "Data Engineer", "Machine Learning Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Deployment Engineer", "Analytics Engineer", "Pipeline Engineer",
                "Graph Engineer", "QA Engineer", "Infrastructure Engineer",
                "Solutions Architect", "Product Engineer", "Technical Lead",
                "Big Data Engineer", "AI Engineer"
            };
            System.out.println("Figma jobs found");
            return jobs;
        }
        else if (companyName=="Autodesk") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Database Engineer",
                "Engineering Manager", "Product Manager", "Kernel Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Atlas Engineer", "Query Optimizer", "Sharding Engineer",
                "Data Platform Engineer", "Machine Learning Engineer", "QA Engineer",
                "Performance Engineer", "Cloud Engineer", "Driver Developer",
                "Technical Evangelist", "Solutions Architect"
            };
            System.out.println("Autodesk jobs found");
            return jobs;
        }
        else if (companyName=="Unity") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Caching Engineer",
                "Engineering Manager", "Product Manager", "Core Developer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "Modules Engineer",
                "Performance Engineer", "QA Engineer", "Infrastructure Engineer",
                "Data Structures Engineer", "Search Engineer", "Graph Engineer",
                "Time Series Engineer", "Solutions Architect"
            };
            System.out.println("Unity jobs found");
            return jobs;
        }
        else if (companyName=="Epic Games") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "IaC Engineer",
                "Engineering Manager", "Product Manager", "Terraform Developer",
                "Vault Engineer", "Consul Engineer", "Nomad Engineer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "QA Engineer",
                "Provider Developer", "API Engineer", "Operator Engineer",
                "Reliability Engineer", "Solutions Architect"
            };
            System.out.println("Epic Games jobs found");
            return jobs;
        }else if (companyName=="Roblox") {
            String[] jobs = {
                "Software Development Engineer", "Senior SDE", "Principal SDE",
                "Engineering Manager", "Program Manager", "Product Manager",
                "Data & Applied Scientist", "Machine Learning Engineer",
                "Azure Cloud Engineer", "DevOps Engineer", "Security Engineer",
                "Windows Developer", "Office Developer", "Power Platform Developer",
                "Full Stack Engineer", "Frontend Developer", "Backend Developer",
                "Test Engineer", "Technical Evangelist", "UX Researcher"
            };
            System.out.println("Roblox jobs found");
            return jobs;
        }
        else if (companyName=="Discord") {
            String[] jobs = {
                "Software Development Engineer I", "SDE II", "Senior SDE",
                "SDE Manager", "Product Manager-Technical", "Technical Program Manager",
                "Data Scientist", "Applied Scientist", "Machine Learning Scientist",
                "Solutions Architect", "Cloud Support Engineer", "DevOps Engineer",
                "Security Engineer", "Android SDE", "iOS SDE",
                "Frontend Engineer", "Backend Engineer", "Fullstack SDE",
                "SDET", "Business Intelligence Engineer", "TPM L6"
            };
            System.out.println("Discord jobs found");
            return jobs;
        }
        else if (companyName=="Twitch") {
            String[] jobs = {
                "Software Engineer", "E3 Software Engineer", "E4 Software Engineer",
                "Engineering Manager", "Product Manager", "Technical Program Manager",
                "Data Scientist", "Machine Learning Engineer", "Research Scientist",
                "Infrastructure Engineer", "Production Engineer", "Security Engineer",
                "Android Engineer", "iOS Engineer", "React Native Engineer",
                "Frontend Engineer", "Backend Engineer", "Full Stack Engineer",
                "Software Engineer in Test", "People Engineer", "Technical Lead"
            };
            System.out.println("Twitch jobs found");
            return jobs;
        }
        else if (companyName=="Pinterest") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "ICT3 Software Engineer",
                "Engineering Manager", "Hardware Engineer", "ASIC Design Engineer",
                "Machine Learning Engineer", "Computer Vision Engineer",
                "iOS Software Engineer", "macOS Engineer", "watchOS Engineer",
                "Siri Engineer", "ARKit Engineer", "Metal Engineer",
                "Frontend Engineer", "Backend Engineer", "Full Stack Developer",
                "QA Engineer", "DevOps Engineer", "Security Engineer"
            };
            System.out.println("Pinterest jobs found");
            return jobs;
        }
        else if (companyName=="Snapchat") {
            String[] jobs = {
                "Senior Software Engineer", "Staff Software Engineer", "Principal Engineer",
                "Engineering Manager", "Content Engineer", "Data Platform Engineer",
                "Senior Data Scientist", "Machine Learning Engineer",
                "Streaming Engineer", "Android Engineer", "iOS Engineer",
                "Frontend Engineer", "Full Stack Engineer", "Backend Engineer",
                "Site Reliability Engineer", "Security Engineer",
                "Performance Engineer", "QA Engineer", "DevOps Engineer",
                "Senior UI Engineer"
            };
            System.out.println("Snapchat jobs found");
            return jobs;
        }
        else if (companyName=="TikTok") {
            String[] jobs = {
                "Software Engineer II", "Senior Software Engineer", "Staff Software Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Applied Scientist",
                "Platform Engineer", "Mobile Engineer", "Android Engineer",
                "iOS Engineer", "Maps Engineer", "Pricing Engineer",
                "Full Stack Engineer", "Backend Engineer", "Frontend Engineer",
                "Security Engineer", "DevOps Engineer", "Reliability Engineer"
            };
            System.out.println("TikTok jobs found");
            return jobs;
        }
        else if (companyName=="ByteDance") {
            String[] jobs = {
                "Senior Software Engineer", "Staff Software Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Staff Machine Learning Engineer",
                "iOS Engineer", "Android Engineer", "Frontend Engineer",
                "Backend Engineer", "Full Stack Engineer", "Maps Engineer",
                "Search Engineer", "Payments Engineer", "Security Engineer",
                "Infrastructure Engineer", "Data Engineer", "Experimentation Engineer"
            };
            System.out.println("ByteDance jobs found");
            return jobs;
        }
        else if (companyName=="LinkedIn ") {
            String[] jobs = {
                "Software Engineer 2", "Senior Software Engineer", "Principal Engineer",
                "Member of Technical Staff", "Engineering Manager", "Product Manager",
                "Data Scientist", "Machine Learning Engineer", "MTS",
                "Lightning Platform Developer", "Apex Developer", "LWC Developer",
                "Full Stack Developer", "Backend Developer", "Frontend Developer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Technical Architect"
            };
            System.out.println("LinkedIn  jobs found");
            return jobs;
        }
        else if (companyName=="Indeed") {
            String[] jobs = {
                "Software Engineer 2", "Senior Software Engineer", "Principal Software Engineer",
                "Engineering Manager", "Product Manager", "Cloud Engineer",
                "Database Engineer", "Java Developer", "Full Stack Developer",
                "Frontend Engineer", "Backend Engineer", "DevOps Engineer",
                "Security Consultant", "Data Engineer", "Data Scientist",
                "Machine Learning Engineer", "Solutions Architect",
                "Technical Support Engineer", "QA Engineer"
            };
            System.out.println("Indeed jobs found");
            return jobs;
        }
        else if (companyName=="Upwork") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Lead Software Engineer",
                "Engineering Manager", "Consulting Software Engineer", "Data Scientist",
                "Machine Learning Engineer", "Watson Developer", "Cloud Engineer",
                "Full Stack Developer", "Java Developer", "Node.js Developer",
                "DevOps Engineer", "Security Engineer", "Cybersecurity Analyst",
                "Blockchain Developer", "Quantum Computing Researcher",
                "Solutions Architect", "Technical Lead"
            };
            System.out.println("Upwork jobs found");
            return jobs;
        }
        else if (companyName=="Freelancer") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer",
                "Autopilot Engineer", "Computer Vision Engineer", "AI/ML Engineer",
                "Embedded Software Engineer", "Firmware Engineer", "Vehicle Software Engineer",
                "Full Self-Driving Engineer", "Infotainment Engineer",
                "Backend Engineer", "DevOps Engineer", "Data Engineer",
                "QA Engineer", "Security Engineer", "Powertrain Software Engineer",
                "Manufacturing Engineer", "Test Engineer"
            };
            System.out.println("Freelancer jobs found");
            return jobs;
        }
        else if (companyName=="Toptal") {
            String[] jobs = {
                "Software Engineer I", "Software Engineer II", "Senior Software Engineer",
                "Computer Scientist", "Engineering Manager", "Product Manager",
                "Data Scientist", "Machine Learning Engineer", "Research Scientist",
                "Creative Cloud Engineer", "Experience Cloud Engineer",
                "Document Cloud Engineer", "Frontend Engineer", "Backend Engineer",
                "Full Stack Engineer", "DevOps Engineer", "Security Engineer",
                "QA Engineer", "UX Engineer"
            };
            System.out.println("Toptal jobs found");
            return jobs;
        }
        else if (companyName=="Goldman Sachs") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Principal Software Engineer",
                "Development Architect", "Engineering Manager", "ABAP Developer",
                "Goldman Sachs Fiori Developer", "SAPUI5 Developer", "S/4HANA Consultant",
                "Full Stack Developer", "Java Developer", "Cloud Developer",
                "Data Scientist", "Machine Learning Engineer", "DevOps Engineer",
                "Security Consultant", "Solutions Architect", "Technical Consultant"
            };
            System.out.println("Goldman Sachs jobs found");
            return jobs;
        }
        else if (companyName=="JPMorgan") {
            String[] jobs = {
                "Software Engineer", "Staff Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "Virtualization Engineer",
                "Cloud Native Engineer", "Kubernetes Engineer", "Tanzu Developer",
                "Full Stack Developer", "Backend Developer", "Frontend Developer",
                "DevOps Engineer", "Site Reliability Engineer", "Security Engineer",
                "Data Engineer", "Machine Learning Engineer", "Solutions Architect"
            };
            System.out.println("JPMorgan jobs found");
            return jobs;
        }
        else if (companyName=="Citadel") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer",
                "Engineering Manager", "Product Manager", "Platform Engineer",
                "Full Stack Developer", "UI Developer", "Backend Developer",
                "DevOps Engineer", "Security Engineer", "Data Engineer",
                "Machine Learning Engineer", "Solutions Architect",
                "Technical Consultant", "Product Analyst", "QA Engineer"
            };
            System.out.println("Citadel jobs found");
            return jobs;
        }
        else if (companyName=="Jane Street") {
            String[] jobs = {
                "Software Engineer II", "Senior Software Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "HCM Product Engineer",
                "Financials Engineer", "Full Stack Engineer", "Backend Engineer",
                "Frontend Engineer", "DevOps Engineer", "Security Engineer",
                "Data Engineer", "Machine Learning Engineer", "QA Engineer",
                "Solutions Architect", "Technical Consultant"
            };
            System.out.println("Jane Street jobs found");
            return jobs;
        }
        
        else if (companyName=="Two Sigma") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "Engineering Manager", "Product Manager", "Payments Engineer",
                "Risk Engineer", "Machine Learning Engineer", "Backend Engineer",
                "Full Stack Engineer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Data Scientist", "Solutions Architect"
            };
            System.out.println("Two Sigma jobs found");
            return jobs;
        }
        else if (companyName=="DE Shaw") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "Engineering Manager", "Product Manager", "Data Platform Engineer",
                "Cloud Engineer", "Full Stack Developer", "Backend Developer",
                "Security Engineer", "Solutions Architect", "Data Scientist"
            };
            System.out.println("DE Shaw jobs found");
            return jobs;
        }
        else if (companyName=="Hudson River Trading") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "ML Platform Engineer", "Data Engineer", "Spark Developer",
                "Full Stack Engineer", "Backend Engineer", "DevOps Engineer"
            };
            System.out.println("Hudson River Trading jobs found");
            return jobs;
        }else if (companyName=="Optiver") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "GPU Software Engineer",
                "Engineering Manager", "AI Research Engineer", "CUDA Developer",
                "Machine Learning Engineer", "Deep Learning Engineer", "Graphics Engineer",
                "Driver Developer", "Embedded Software Engineer", "Firmware Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Scientist",
                "Computer Vision Engineer", "Performance Engineer", "QA Engineer",
                "Security Engineer", "Systems Architect"
            };
            System.out.println("Optiver jobs found");
            return jobs;
        }
        else if (companyName=="IMC Trading") {
            String[] jobs = {
                "Software Engineer", "Research Engineer", "ML Engineer",
                "Engineering Manager", "Product Manager", "AI Safety Engineer",
                "Machine Learning Researcher", "Backend Engineer", "Infrastructure Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Engineer",
                "Prompt Engineer", "Applied Scientist", "Security Engineer",
                "Site Reliability Engineer", "QA Engineer", "Technical Lead",
                "Solutions Architect", "Ethics Engineer"
            };
            System.out.println("IMC Trading jobs found");
            return jobs;
        }
        else if (companyName=="DRW") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Network Software Engineer",
                "Engineering Manager", "Product Manager", "Security Engineer",
                "DevOps Engineer", "Cloud Engineer", "Full Stack Developer",
                "Backend Engineer", "Frontend Engineer", "Embedded Engineer",
                "Data Scientist", "Machine Learning Engineer", "QA Engineer",
                "Site Reliability Engineer", "Solutions Architect", "Technical Support Engineer",
                "Cybersecurity Analyst", "Systems Engineer"
            };
            System.out.println("DRW jobs found");
            return jobs;
        }
        else if (companyName=="Jump Trading") {
            String[] jobs = {
                "Software Engineer", "Backend Engineer", "Frontend Engineer",
                "Engineering Manager", "Product Manager", "DevOps Engineer",
                "Full Stack Developer", "Security Engineer", "QA Engineer",
                "Infrastructure Engineer", "Data Engineer", "Machine Learning Engineer",
                "Ruby Developer", "Go Engineer", "Site Reliability Engineer",
                "UX Engineer", "Technical Writer", "Release Engineer",
                "Platform Engineer", "Solutions Architect"
            };
            System.out.println("Jump Trading jobs found");
            return jobs;
        }
        else if (companyName=="Tower Research") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Firmware Engineer",
                "Engineering Manager", "Hardware Software Engineer", "AI Engineer",
                "Machine Learning Engineer", "Embedded Developer", "Driver Developer",
                "Full Stack Engineer", "DevOps Engineer", "Data Scientist",
                "Performance Engineer", "QA Engineer", "Security Engineer",
                "Systems Architect", "Cloud Engineer", "Graphics Software Engineer",
                "Validation Engineer", "Technical Lead"
            };
            System.out.println("Tower Research jobs found");
            return jobs;
        }
        else if (companyName=="Millennium") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Modem Software Engineer",
                "Engineering Manager", "Chipset Software Developer", "5G Engineer",
                "Machine Learning Engineer", "Embedded Engineer", "Android Engineer",
                "Full Stack Developer", "DevOps Engineer", "QA Engineer",
                "Security Engineer", "Multimedia Engineer", "Camera Software Engineer",
                "Driver Developer", "Systems Engineer", "Firmware Engineer",
                "Protocol Engineer", "Solutions Architect"
            };
            System.out.println("Millennium jobs found");
            return jobs;
        }
        else if (companyName=="Point72") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "Risk Engineer",
                "Machine Learning Engineer", "Fraud Detection Engineer", "Backend Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Scientist",
                "Security Engineer", "Mobile Developer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Blockchain Engineer", "Solutions Architect"
            };
            System.out.println("Point72 jobs found");
            return jobs;
        }
        else if (companyName=="Renaissance Technologies") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Platform Engineer",
                "Engineering Manager", "Product Manager", "Cloud Engineer",
                "Full Stack Developer", "Backend Engineer", "Frontend Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Data Engineer", "Machine Learning Engineer", "Jira Developer",
                "Confluence Engineer", "Scalability Engineer", "Technical Lead",
                "Infrastructure Engineer", "Solutions Architect"
            };
            System.out.println("Renaissance Technologies jobs found");
            return jobs;
        }
        else if (companyName=="BlackRock") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Communications Platform Engineer",
                "Engineering Manager", "Product Manager", "API Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Voice Engineer", "Messaging Engineer",
                "Scalability Engineer", "Solutions Architect"
            };
            System.out.println("BlackRock jobs found");
            return jobs;
        }

        else if (companyName=="Vanguard") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Delivery Platform Engineer",
                "Engineering Manager", "Product Manager", "Machine Learning Engineer",
                "Backend Engineer", "Full Stack Developer", "Android Engineer",
                "iOS Engineer", "DevOps Engineer", "Data Scientist",
                "Maps Engineer", "Payments Engineer", "Security Engineer",
                "QA Engineer", "Logistics Engineer", "Frontend Engineer",
                "Site Reliability Engineer", "Solutions Architect"
            };
            System.out.println("Vanguard jobs found");
            return jobs;
        }
        else if (companyName=="Fidelity") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Music Platform Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Backend Engineer", "Android Developer",
                "iOS Developer", "Full Stack Engineer", "DevOps Engineer",
                "Security Engineer", "Recommendation Engineer", "QA Engineer",
                "Frontend Engineer", "Streaming Engineer", "Personalization Engineer",
                "Podcast Engineer", "Solutions Architect"
            };
            System.out.println("Fidelity jobs found");
            return jobs;
        }
        else if (companyName=="Robinhood") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "POS Developer",
                "Machine Learning Engineer", "Risk Engineer", "Backend Engineer",
                "Full Stack Developer", "Mobile Engineer", "DevOps Engineer",
                "Security Engineer", "Data Engineer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Hardware Software Engineer", "Solutions Architect"
            };
            System.out.println("Robinhood jobs found");
            return jobs;
        }
        else if (companyName=="Coinbase") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Storage Engineer",
                "Engineering Manager", "Product Manager", "Sync Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Cloud Engineer", "Sharing Engineer",
                "Collaboration Engineer", "Solutions Architect"
            };
            System.out.println("Coinbase jobs found");
            return jobs;
        }
        else if (companyName=="Binance") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Collaboration Platform Engineer",
                "Engineering Manager", "Product Manager", "Backend Engineer",
                "Full Stack Developer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Integrations Engineer", "Machine Learning Engineer",
                "Mobile Developer", "QA Engineer", "Search Engineer",
                "Notifications Engineer", "API Engineer", "Scalability Engineer",
                "UX Engineer", "Solutions Architect"
            };
            System.out.println("Binance jobs found");
            return jobs;
        }
        else if (companyName=="Kraken") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Video Platform Engineer",
                "Engineering Manager", "Product Manager", "Real-time Engineer",
                "Backend Engineer", "Frontend Engineer", "Mobile Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Machine Learning Engineer", "Streaming Engineer", "WebRTC Developer",
                "Full Stack Developer", "Infrastructure Engineer", "Reliability Engineer",
                "Data Engineer", "Solutions Architect"
            };
            System.out.println("Kraken jobs found");
            return jobs;
        }
        else if (companyName=="Gemini") {
            String[] jobs = {
                "Software Engineer", "Forward Deployed Engineer", "Backend Engineer",
                "Engineering Manager", "Data Engineer", "Machine Learning Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Deployment Engineer", "Analytics Engineer", "Pipeline Engineer",
                "Graph Engineer", "QA Engineer", "Infrastructure Engineer",
                "Solutions Architect", "Product Engineer", "Technical Lead",
                "Big Data Engineer", "AI Engineer"
            };
            System.out.println("Gemini jobs found");
            return jobs;
        }
        else if (companyName=="Block") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Database Engineer",
                "Engineering Manager", "Product Manager", "Kernel Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Atlas Engineer", "Query Optimizer", "Sharding Engineer",
                "Data Platform Engineer", "Machine Learning Engineer", "QA Engineer",
                "Performance Engineer", "Cloud Engineer", "Driver Developer",
                "Technical Evangelist", "Solutions Architect"
            };
            System.out.println("Block jobs found");
            return jobs;
        }
        else if (companyName=="Chime") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Caching Engineer",
                "Engineering Manager", "Product Manager", "Core Developer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "Modules Engineer",
                "Performance Engineer", "QA Engineer", "Infrastructure Engineer",
                "Data Structures Engineer", "Search Engineer", "Graph Engineer",
                "Time Series Engineer", "Solutions Architect"
            };
            System.out.println("Chime jobs found");
            return jobs;
        }
        else if (companyName=="Revolut") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "IaC Engineer",
                "Engineering Manager", "Product Manager", "Terraform Developer",
                "Vault Engineer", "Consul Engineer", "Nomad Engineer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "QA Engineer",
                "Provider Developer", "API Engineer", "Operator Engineer",
                "Reliability Engineer", "Solutions Architect"
            };
            System.out.println("Revolut jobs found");
            return jobs;
        }else if (companyName=="Monzo") {
            String[] jobs = {
                "Software Development Engineer", "Senior SDE", "Principal SDE",
                "Engineering Manager", "Program Manager", "Product Manager",
                "Data & Applied Scientist", "Machine Learning Engineer",
                "Azure Cloud Engineer", "DevOps Engineer", "Security Engineer",
                "Windows Developer", "Office Developer", "Power Platform Developer",
                "Full Stack Engineer", "Frontend Developer", "Backend Developer",
                "Test Engineer", "Technical Evangelist", "UX Researcher"
            };
            System.out.println("Monzo jobs found");
            return jobs;
        }
        else if (companyName=="N26") {
            String[] jobs = {
                "Software Development Engineer I", "SDE II", "Senior SDE",
                "SDE Manager", "Product Manager-Technical", "Technical Program Manager",
                "Data Scientist", "Applied Scientist", "Machine Learning Scientist",
                "Solutions Architect", "Cloud Support Engineer", "DevOps Engineer",
                "Security Engineer", "Android SDE", "iOS SDE",
                "Frontend Engineer", "Backend Engineer", "Fullstack SDE",
                "SDET", "Business Intelligence Engineer", "TPM L6"
            };
            System.out.println("N26 jobs found");
            return jobs;
        }
        else if (companyName=="Klarna") {
            String[] jobs = {
                "Software Engineer", "E3 Software Engineer", "E4 Software Engineer",
                "Engineering Manager", "Product Manager", "Technical Program Manager",
                "Data Scientist", "Machine Learning Engineer", "Research Scientist",
                "Infrastructure Engineer", "Production Engineer", "Security Engineer",
                "Android Engineer", "iOS Engineer", "React Native Engineer",
                "Frontend Engineer", "Backend Engineer", "Full Stack Engineer",
                "Software Engineer in Test", "People Engineer", "Technical Lead"
            };
            System.out.println("Klarna jobs found");
            return jobs;
        }
        else if (companyName=="Afterpay") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "ICT3 Software Engineer",
                "Engineering Manager", "Hardware Engineer", "ASIC Design Engineer",
                "Machine Learning Engineer", "Computer Vision Engineer",
                "iOS Software Engineer", "macOS Engineer", "watchOS Engineer",
                "Siri Engineer", "ARKit Engineer", "Metal Engineer",
                "Frontend Engineer", "Backend Engineer", "Full Stack Developer",
                "QA Engineer", "DevOps Engineer", "Security Engineer"
            };
            System.out.println("Afterpay jobs found");
            return jobs;
        }
        else if (companyName=="Affirm") {
            String[] jobs = {
                "Senior Software Engineer", "Staff Software Engineer", "Principal Engineer",
                "Engineering Manager", "Content Engineer", "Data Platform Engineer",
                "Senior Data Scientist", "Machine Learning Engineer",
                "Streaming Engineer", "Android Engineer", "iOS Engineer",
                "Frontend Engineer", "Full Stack Engineer", "Backend Engineer",
                "Site Reliability Engineer", "Security Engineer",
                "Performance Engineer", "QA Engineer", "DevOps Engineer",
                "Senior UI Engineer"
            };
            System.out.println("Affirm jobs found");
            return jobs;
        }
        else if (companyName=="Adyen") {
            String[] jobs = {
                "Software Engineer II", "Senior Software Engineer", "Staff Software Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Applied Scientist",
                "Platform Engineer", "Mobile Engineer", "Android Engineer",
                "iOS Engineer", "Maps Engineer", "Pricing Engineer",
                "Full Stack Engineer", "Backend Engineer", "Frontend Engineer",
                "Security Engineer", "DevOps Engineer", "Reliability Engineer"
            };
            System.out.println("Adyen jobs found");
            return jobs;
        }
        else if (companyName=="Checkout.com") {
            String[] jobs = {
                "Senior Software Engineer", "Staff Software Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Staff Machine Learning Engineer",
                "iOS Engineer", "Android Engineer", "Frontend Engineer",
                "Backend Engineer", "Full Stack Engineer", "Maps Engineer",
                "Search Engineer", "Payments Engineer", "Security Engineer",
                "Infrastructure Engineer", "Data Engineer", "Experimentation Engineer"
            };
            System.out.println("Checkout.com jobs found");
            return jobs;
        }
        else if (companyName=="Marqeta") {
            String[] jobs = {
                "Software Engineer 2", "Senior Software Engineer", "Principal Engineer",
                "Member of Technical Staff", "Engineering Manager", "Product Manager",
                "Data Scientist", "Machine Learning Engineer", "MTS",
                "Lightning Platform Developer", "Apex Developer", "LWC Developer",
                "Full Stack Developer", "Backend Developer", "Frontend Developer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Technical Architect"
            };
            System.out.println("Marqeta jobs found");
            return jobs;
        }
        else if (companyName=="Wise") {
            String[] jobs = {
                "Software Engineer 2", "Senior Software Engineer", "Principal Software Engineer",
                "Engineering Manager", "Product Manager", "Cloud Engineer",
                "Database Engineer", "Java Developer", "Full Stack Developer",
                "Frontend Engineer", "Backend Engineer", "DevOps Engineer",
                "Security Consultant", "Data Engineer", "Data Scientist",
                "Machine Learning Engineer", "Solutions Architect",
                "Technical Support Engineer", "QA Engineer"
            };
            System.out.println("Wise jobs found");
            return jobs;
        }
        else if (companyName=="Rapyd") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Lead Software Engineer",
                "Engineering Manager", "Consulting Software Engineer", "Data Scientist",
                "Machine Learning Engineer", "Watson Developer", "Cloud Engineer",
                "Full Stack Developer", "Java Developer", "Node.js Developer",
                "DevOps Engineer", "Security Engineer", "Cybersecurity Analyst",
                "Blockchain Developer", "Quantum Computing Researcher",
                "Solutions Architect", "Technical Lead"
            };
            System.out.println("Rapyd jobs found");
            return jobs;
        }
        else if (companyName=="Intuit") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer",
                "Autopilot Engineer", "Computer Vision Engineer", "AI/ML Engineer",
                "Embedded Software Engineer", "Firmware Engineer", "Vehicle Software Engineer",
                "Full Self-Driving Engineer", "Infotainment Engineer",
                "Backend Engineer", "DevOps Engineer", "Data Engineer",
                "QA Engineer", "Security Engineer", "Powertrain Software Engineer",
                "Manufacturing Engineer", "Test Engineer"
            };
            System.out.println("Intuit jobs found");
            return jobs;
        }
        else if (companyName=="Xero") {
            String[] jobs = {
                "Software Engineer I", "Software Engineer II", "Senior Software Engineer",
                "Computer Scientist", "Engineering Manager", "Product Manager",
                "Data Scientist", "Machine Learning Engineer", "Research Scientist",
                "Creative Cloud Engineer", "Experience Cloud Engineer",
                "Document Cloud Engineer", "Frontend Engineer", "Backend Engineer",
                "Full Stack Engineer", "DevOps Engineer", "Security Engineer",
                "QA Engineer", "UX Engineer"
            };
            System.out.println("Xero jobs found");
            return jobs;
        }
        else if (companyName=="Freshworks") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Principal Software Engineer",
                "Development Architect", "Engineering Manager", "ABAP Developer",
                "Freshworks Fiori Developer", "SAPUI5 Developer", "S/4HANA Consultant",
                "Full Stack Developer", "Java Developer", "Cloud Developer",
                "Data Scientist", "Machine Learning Engineer", "DevOps Engineer",
                "Security Consultant", "Solutions Architect", "Technical Consultant"
            };
            System.out.println("Freshworks jobs found");
            return jobs;
        }
        else if (companyName=="Zoho") {
            String[] jobs = {
                "Software Engineer", "Staff Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "Virtualization Engineer",
                "Cloud Native Engineer", "Kubernetes Engineer", "Tanzu Developer",
                "Full Stack Developer", "Backend Developer", "Frontend Developer",
                "DevOps Engineer", "Site Reliability Engineer", "Security Engineer",
                "Data Engineer", "Machine Learning Engineer", "Solutions Architect"
            };
            System.out.println("Zoho jobs found");
            return jobs;
        }
        else if (companyName=="Freshdesk") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Software Engineer",
                "Engineering Manager", "Product Manager", "Platform Engineer",
                "Full Stack Developer", "UI Developer", "Backend Developer",
                "DevOps Engineer", "Security Engineer", "Data Engineer",
                "Machine Learning Engineer", "Solutions Architect",
                "Technical Consultant", "Product Analyst", "QA Engineer"
            };
            System.out.println("Freshdesk jobs found");
            return jobs;
        }
        else if (companyName=="Pipedrive") {
            String[] jobs = {
                "Software Engineer II", "Senior Software Engineer", "Principal Engineer",
                "Engineering Manager", "Product Manager", "HCM Product Engineer",
                "Financials Engineer", "Full Stack Engineer", "Backend Engineer",
                "Frontend Engineer", "DevOps Engineer", "Security Engineer",
                "Data Engineer", "Machine Learning Engineer", "QA Engineer",
                "Solutions Architect", "Technical Consultant"
            };
            System.out.println("Pipedrive jobs found");
            return jobs;
        }
        
        else if (companyName=="HubSpot") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "Engineering Manager", "Product Manager", "Payments Engineer",
                "Risk Engineer", "Machine Learning Engineer", "Backend Engineer",
                "Full Stack Engineer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Data Scientist", "Solutions Architect"
            };
            System.out.println("HubSpot jobs found");
            return jobs;
        }
        else if (companyName=="Marketo") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "Engineering Manager", "Product Manager", "Data Platform Engineer",
                "Cloud Engineer", "Full Stack Developer", "Backend Developer",
                "Security Engineer", "Solutions Architect", "Data Scientist"
            };
            System.out.println("Marketo jobs found");
            return jobs;
        }
        else if (companyName=="Pardot") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Staff Engineer",
                "ML Platform Engineer", "Data Engineer", "Spark Developer",
                "Full Stack Engineer", "Backend Engineer", "DevOps Engineer"
            };
            System.out.println("Pardot jobs found");
            return jobs;
        }else if (companyName=="Outreach") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "GPU Software Engineer",
                "Engineering Manager", "AI Research Engineer", "CUDA Developer",
                "Machine Learning Engineer", "Deep Learning Engineer", "Graphics Engineer",
                "Driver Developer", "Embedded Software Engineer", "Firmware Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Scientist",
                "Computer Vision Engineer", "Performance Engineer", "QA Engineer",
                "Security Engineer", "Systems Architect"
            };
            System.out.println("Outreach jobs found");
            return jobs;
        }
        else if (companyName=="Salesloft") {
            String[] jobs = {
                "Software Engineer", "Research Engineer", "ML Engineer",
                "Engineering Manager", "Product Manager", "AI Safety Engineer",
                "Machine Learning Researcher", "Backend Engineer", "Infrastructure Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Engineer",
                "Prompt Engineer", "Applied Scientist", "Security Engineer",
                "Site Reliability Engineer", "QA Engineer", "Technical Lead",
                "Solutions Architect", "Ethics Engineer"
            };
            System.out.println("Salesloft jobs found");
            return jobs;
        }
        else if (companyName=="Gong") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Network Software Engineer",
                "Engineering Manager", "Product Manager", "Security Engineer",
                "DevOps Engineer", "Cloud Engineer", "Full Stack Developer",
                "Backend Engineer", "Frontend Engineer", "Embedded Engineer",
                "Data Scientist", "Machine Learning Engineer", "QA Engineer",
                "Site Reliability Engineer", "Solutions Architect", "Technical Support Engineer",
                "Cybersecurity Analyst", "Systems Engineer"
            };
            System.out.println("Gong jobs found");
            return jobs;
        }
        else if (companyName=="Chorus.ai") {
            String[] jobs = {
                "Software Engineer", "Backend Engineer", "Frontend Engineer",
                "Engineering Manager", "Product Manager", "DevOps Engineer",
                "Full Stack Developer", "Security Engineer", "QA Engineer",
                "Infrastructure Engineer", "Data Engineer", "Machine Learning Engineer",
                "Ruby Developer", "Go Engineer", "Site Reliability Engineer",
                "UX Engineer", "Technical Writer", "Release Engineer",
                "Platform Engineer", "Solutions Architect"
            };
            System.out.println("Chorus.ai jobs found");
            return jobs;
        }
        else if (companyName=="Drift") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Firmware Engineer",
                "Engineering Manager", "Hardware Software Engineer", "AI Engineer",
                "Machine Learning Engineer", "Embedded Developer", "Driver Developer",
                "Full Stack Engineer", "DevOps Engineer", "Data Scientist",
                "Performance Engineer", "QA Engineer", "Security Engineer",
                "Systems Architect", "Cloud Engineer", "Graphics Software Engineer",
                "Validation Engineer", "Technical Lead"
            };
            System.out.println("Drift jobs found");
            return jobs;
        }
        else if (companyName=="Intercom") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Modem Software Engineer",
                "Engineering Manager", "Chipset Software Developer", "5G Engineer",
                "Machine Learning Engineer", "Embedded Engineer", "Android Engineer",
                "Full Stack Developer", "DevOps Engineer", "QA Engineer",
                "Security Engineer", "Multimedia Engineer", "Camera Software Engineer",
                "Driver Developer", "Systems Engineer", "Firmware Engineer",
                "Protocol Engineer", "Solutions Architect"
            };
            System.out.println("Intercom jobs found");
            return jobs;
        }
        else if (companyName=="Zendesk") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "Risk Engineer",
                "Machine Learning Engineer", "Fraud Detection Engineer", "Backend Engineer",
                "Full Stack Developer", "DevOps Engineer", "Data Scientist",
                "Security Engineer", "Mobile Developer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Blockchain Engineer", "Solutions Architect"
            };
            System.out.println("Zendesk jobs found");
            return jobs;
        }
        else if (companyName=="Gainsight") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Platform Engineer",
                "Engineering Manager", "Product Manager", "Cloud Engineer",
                "Full Stack Developer", "Backend Engineer", "Frontend Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Data Engineer", "Machine Learning Engineer", "Jira Developer",
                "Confluence Engineer", "Scalability Engineer", "Technical Lead",
                "Infrastructure Engineer", "Solutions Architect"
            };
            System.out.println("Gainsight jobs found");
            return jobs;
        }
        else if (companyName=="Totango") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Communications Platform Engineer",
                "Engineering Manager", "Product Manager", "API Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Voice Engineer", "Messaging Engineer",
                "Scalability Engineer", "Solutions Architect"
            };
            System.out.println("Totango jobs found");
            return jobs;
        }

        else if (companyName=="Qualtrics") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Delivery Platform Engineer",
                "Engineering Manager", "Product Manager", "Machine Learning Engineer",
                "Backend Engineer", "Full Stack Developer", "Android Engineer",
                "iOS Engineer", "DevOps Engineer", "Data Scientist",
                "Maps Engineer", "Payments Engineer", "Security Engineer",
                "QA Engineer", "Logistics Engineer", "Frontend Engineer",
                "Site Reliability Engineer", "Solutions Architect"
            };
            System.out.println("Qualtrics jobs found");
            return jobs;
        }
        else if (companyName=="Medallia") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Music Platform Engineer",
                "Engineering Manager", "Product Manager", "Data Scientist",
                "Machine Learning Engineer", "Backend Engineer", "Android Developer",
                "iOS Developer", "Full Stack Engineer", "DevOps Engineer",
                "Security Engineer", "Recommendation Engineer", "QA Engineer",
                "Frontend Engineer", "Streaming Engineer", "Personalization Engineer",
                "Podcast Engineer", "Solutions Architect"
            };
            System.out.println("Medallia jobs found");
            return jobs;
        }
        else if (companyName=="SurveyMonkey") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "POS Developer",
                "Machine Learning Engineer", "Risk Engineer", "Backend Engineer",
                "Full Stack Developer", "Mobile Engineer", "DevOps Engineer",
                "Security Engineer", "Data Engineer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Hardware Software Engineer", "Solutions Architect"
            };
            System.out.println("SurveyMonkey jobs found");
            return jobs;
        }
        else if (companyName=="Typeform") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Storage Engineer",
                "Engineering Manager", "Product Manager", "Sync Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Cloud Engineer", "Sharing Engineer",
                "Collaboration Engineer", "Solutions Architect"
            };
            System.out.println("Typeform jobs found");
            return jobs;
        }
        else if (companyName=="Delve") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Collaboration Platform Engineer",
                "Engineering Manager", "Product Manager", "Backend Engineer",
                "Full Stack Developer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Integrations Engineer", "Machine Learning Engineer",
                "Mobile Developer", "QA Engineer", "Search Engineer",
                "Notifications Engineer", "API Engineer", "Scalability Engineer",
                "UX Engineer", "Solutions Architect"
            };
            System.out.println("Delve jobs found");
            return jobs;
        }
        else if (companyName=="UserTesting") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Video Platform Engineer",
                "Engineering Manager", "Product Manager", "Real-time Engineer",
                "Backend Engineer", "Frontend Engineer", "Mobile Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Machine Learning Engineer", "Streaming Engineer", "WebRTC Developer",
                "Full Stack Developer", "Infrastructure Engineer", "Reliability Engineer",
                "Data Engineer", "Solutions Architect"
            };
            System.out.println("UserTesting jobs found");
            return jobs;
        }
        else if (companyName=="Hotjar") {
            String[] jobs = {
                "Software Engineer", "Forward Deployed Engineer", "Backend Engineer",
                "Engineering Manager", "Data Engineer", "Machine Learning Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Deployment Engineer", "Analytics Engineer", "Pipeline Engineer",
                "Graph Engineer", "QA Engineer", "Infrastructure Engineer",
                "Solutions Architect", "Product Engineer", "Technical Lead",
                "Big Data Engineer", "AI Engineer"
            };
            System.out.println("Hotjar jobs found");
            return jobs;
        }
        else if (companyName=="FullStory") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Database Engineer",
                "Engineering Manager", "Product Manager", "Kernel Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Atlas Engineer", "Query Optimizer", "Sharding Engineer",
                "Data Platform Engineer", "Machine Learning Engineer", "QA Engineer",
                "Performance Engineer", "Cloud Engineer", "Driver Developer",
                "Technical Evangelist", "Solutions Architect"
            };
            System.out.println("FullStory jobs found");
            return jobs;
        }
        else if (companyName=="Redis") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Caching Engineer",
                "Engineering Manager", "Product Manager", "Core Developer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "Modules Engineer",
                "Performance Engineer", "QA Engineer", "Infrastructure Engineer",
                "Data Structures Engineer", "Search Engineer", "Graph Engineer",
                "Time Series Engineer", "Solutions Architect"
            };
            System.out.println("Redis jobs found");
            return jobs;
        }
        else if (companyName=="LogRocket") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "IaC Engineer",
                "Engineering Manager", "Product Manager", "Terraform Developer",
                "Vault Engineer", "Consul Engineer", "Nomad Engineer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "QA Engineer",
                "Provider Developer", "API Engineer", "Operator Engineer",
                "Reliability Engineer", "Solutions Architect"
            };
            System.out.println("LogRocket jobs found");
            return jobs;
        }
		
		
		
		else if (companyName=="Contentsquare") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "POS Developer",
                "Machine Learning Engineer", "Risk Engineer", "Backend Engineer",
                "Full Stack Developer", "Mobile Engineer", "DevOps Engineer",
                "Security Engineer", "Data Engineer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Hardware Software Engineer", "Solutions Architect"
            };
            System.out.println("Contentsquare jobs found");
            return jobs;
        }
        else if (companyName=="Heap") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Storage Engineer",
                "Engineering Manager", "Product Manager", "Sync Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Cloud Engineer", "Sharing Engineer",
                "Collaboration Engineer", "Solutions Architect"
            };
            System.out.println("Heap jobs found");
            return jobs;
        }
        else if (companyName=="Mixpanel") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Collaboration Platform Engineer",
                "Engineering Manager", "Product Manager", "Backend Engineer",
                "Full Stack Developer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Integrations Engineer", "Machine Learning Engineer",
                "Mobile Developer", "QA Engineer", "Search Engineer",
                "Notifications Engineer", "API Engineer", "Scalability Engineer",
                "UX Engineer", "Solutions Architect"
            };
            System.out.println("Mixpanel jobs found");
            return jobs;
        }
        else if (companyName=="Snowplow") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Video Platform Engineer",
                "Engineering Manager", "Product Manager", "Real-time Engineer",
                "Backend Engineer", "Frontend Engineer", "Mobile Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Machine Learning Engineer", "Streaming Engineer", "WebRTC Developer",
                "Full Stack Developer", "Infrastructure Engineer", "Reliability Engineer",
                "Data Engineer", "Solutions Architect"
            };
            System.out.println("Snowplow jobs found");
            return jobs;
        }
        else if (companyName=="mParticle") {
            String[] jobs = {
                "Software Engineer", "Forward Deployed Engineer", "Backend Engineer",
                "Engineering Manager", "Data Engineer", "Machine Learning Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Deployment Engineer", "Analytics Engineer", "Pipeline Engineer",
                "Graph Engineer", "QA Engineer", "Infrastructure Engineer",
                "Solutions Architect", "Product Engineer", "Technical Lead",
                "Big Data Engineer", "AI Engineer"
            };
            System.out.println("mParticle jobs found");
            return jobs;
        }
        else if (companyName=="Tealium") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Database Engineer",
                "Engineering Manager", "Product Manager", "Kernel Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Atlas Engineer", "Query Optimizer", "Sharding Engineer",
                "Data Platform Engineer", "Machine Learning Engineer", "QA Engineer",
                "Performance Engineer", "Cloud Engineer", "Driver Developer",
                "Technical Evangelist", "Solutions Architect"
            };
            System.out.println("Tealium jobs found");
            return jobs;
        }
        else if (companyName=="RudderStack") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Caching Engineer",
                "Engineering Manager", "Product Manager", "Core Developer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "Modules Engineer",
                "Performance Engineer", "QA Engineer", "Infrastructure Engineer",
                "Data Structures Engineer", "Search Engineer", "Graph Engineer",
                "Time Series Engineer", "Solutions Architect"
            };
            System.out.println("RudderStack jobs found");
            return jobs;
        }
        else if (companyName=="Braze") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "IaC Engineer",
                "Engineering Manager", "Product Manager", "Terraform Developer",
                "Vault Engineer", "Consul Engineer", "Nomad Engineer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "QA Engineer",
                "Provider Developer", "API Engineer", "Operator Engineer",
                "Reliability Engineer", "Solutions Architect"
            };
            System.out.println("Braze jobs found");
            return jobs;
        }
		else if (companyName=="Iterable") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Payments Engineer",
                "Engineering Manager", "Product Manager", "POS Developer",
                "Machine Learning Engineer", "Risk Engineer", "Backend Engineer",
                "Full Stack Developer", "Mobile Engineer", "DevOps Engineer",
                "Security Engineer", "Data Engineer", "Frontend Engineer",
                "API Engineer", "Compliance Engineer", "QA Engineer",
                "Hardware Software Engineer", "Solutions Architect"
            };
            System.out.println("Iterable jobs found");
            return jobs;
        }
        else if (companyName=="Customer.io") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Storage Engineer",
                "Engineering Manager", "Product Manager", "Sync Engineer",
                "Backend Engineer", "Full Stack Developer", "DevOps Engineer",
                "Security Engineer", "Machine Learning Engineer", "Data Scientist",
                "Mobile Engineer", "Frontend Engineer", "QA Engineer",
                "Reliability Engineer", "Cloud Engineer", "Sharing Engineer",
                "Collaboration Engineer", "Solutions Architect"
            };
            System.out.println("Customer.io jobs found");
            return jobs;
        }
        else if (companyName=="Klaviyo") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Collaboration Platform Engineer",
                "Engineering Manager", "Product Manager", "Backend Engineer",
                "Full Stack Developer", "Frontend Engineer", "DevOps Engineer",
                "Security Engineer", "Integrations Engineer", "Machine Learning Engineer",
                "Mobile Developer", "QA Engineer", "Search Engineer",
                "Notifications Engineer", "API Engineer", "Scalability Engineer",
                "UX Engineer", "Solutions Architect"
            };
            System.out.println("Klaviyo jobs found");
            return jobs;
        }
        else if (companyName=="ActiveCampaign") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Video Platform Engineer",
                "Engineering Manager", "Product Manager", "Real-time Engineer",
                "Backend Engineer", "Frontend Engineer", "Mobile Engineer",
                "DevOps Engineer", "Security Engineer", "QA Engineer",
                "Machine Learning Engineer", "Streaming Engineer", "WebRTC Developer",
                "Full Stack Developer", "Infrastructure Engineer", "Reliability Engineer",
                "Data Engineer", "Solutions Architect"
            };
            System.out.println("ActiveCampaign jobs found");
            return jobs;
        }
        else if (companyName=="Mailchimp") {
            String[] jobs = {
                "Software Engineer", "Forward Deployed Engineer", "Backend Engineer",
                "Engineering Manager", "Data Engineer", "Machine Learning Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Deployment Engineer", "Analytics Engineer", "Pipeline Engineer",
                "Graph Engineer", "QA Engineer", "Infrastructure Engineer",
                "Solutions Architect", "Product Engineer", "Technical Lead",
                "Big Data Engineer", "AI Engineer"
            };
            System.out.println("Mailchimp jobs found");
            return jobs;
        }
        else if (companyName=="Sendinblue") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Database Engineer",
                "Engineering Manager", "Product Manager", "Kernel Engineer",
                "Full Stack Developer", "DevOps Engineer", "Security Engineer",
                "Atlas Engineer", "Query Optimizer", "Sharding Engineer",
                "Data Platform Engineer", "Machine Learning Engineer", "QA Engineer",
                "Performance Engineer", "Cloud Engineer", "Driver Developer",
                "Technical Evangelist", "Solutions Architect"
            };
            System.out.println("Sendinblue jobs found");
            return jobs;
        }
        else if (companyName=="Postmark") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "Caching Engineer",
                "Engineering Manager", "Product Manager", "Core Developer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "Modules Engineer",
                "Performance Engineer", "QA Engineer", "Infrastructure Engineer",
                "Data Structures Engineer", "Search Engineer", "Graph Engineer",
                "Time Series Engineer", "Solutions Architect"
            };
            System.out.println("Postmark jobs found");
            return jobs;
        }
        else if (companyName=="Amazon SES") {
            String[] jobs = {
                "Software Engineer", "Senior Software Engineer", "IaC Engineer",
                "Engineering Manager", "Product Manager", "Terraform Developer",
                "Vault Engineer", "Consul Engineer", "Nomad Engineer",
                "Backend Engineer", "DevOps Engineer", "Security Engineer",
                "Full Stack Developer", "Cloud Engineer", "QA Engineer",
                "Provider Developer", "API Engineer", "Operator Engineer",
                "Reliability Engineer", "Solutions Architect"
            };
            System.out.println("Amazon SES jobs found");
            return jobs;
        }
		
		
		
        else {
            System.out.println(companyName + " jobs not found");
            return null;
        }
    }

    public static void getJobNames(String[] jobs) {
        System.out.println("fetching jobs....");
        System.out.println("--------------------------------");
        for (String job : jobs) {
            System.out.println(job);
        }
        System.out.println("Above are the jobs List");
        System.out.println("--------------------------------");
    }
}


