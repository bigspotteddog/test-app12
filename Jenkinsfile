node {
   def mvnHome
   stage('Preparation') {
      git 'https://github.com/bigspotteddog/test-app12.git'
      mvnHome = tool 'M3'
   }
   stage('Build') {
      sh "'${mvnHome}/bin/mvn' clean package"
   }
   stage('Results') {
      archiveArtifacts 'target/*.jar'
   }
}
