def gitDownload(repo)
{
   git "https://github.com/Ganeshpanda51/${repo}.git"
}
def mavenBuild()
{
   sh 'mvn package'
}  
