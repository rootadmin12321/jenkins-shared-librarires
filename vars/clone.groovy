def call(String url, String branch){
  echo "Cloning the repository: ${url} on branch ${branch}"
  git url: "${url}", branch: "${branch}"
}
