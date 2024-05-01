def gitdownload(repo)
{
   git "https://github.com/Ganeshpanda51/${repo}.git"
} 
def mavenBuild()
{
   sh 'mvn package'
   sh 'mvn package'
}  
    
       
