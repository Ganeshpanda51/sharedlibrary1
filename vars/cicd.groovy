def gitdownload(repo)
{
   git "https://github.com/Ganeshpanda51/${repo}.git"
} 
def mavenbuild()
{
   sh 'mvn package'
   sh 'mvn package'
}  
    
       
