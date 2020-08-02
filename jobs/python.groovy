project_name = "jenkins-pipeline-python"
repo = "https://github.com/atacho7/test-jenkins1.git"
repo_name = "repo"


pipelineJob(project_name) {
	definition {
	   triggers{
	      scm('H/1 * * * *')
	   }

	   cpsScm{
	       scm {
	           git {
	               remote {
	               name(repo_name)
	               url(repo)
	               }
	           }
	           scriptPath("Jenkinsfile")
	           
	       }
	   }
	}
}
