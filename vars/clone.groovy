def call(String url, String Branch){
  echo 'Cloning the repository...'
  git url: "${url}", branch: "${branch}"
 
}
