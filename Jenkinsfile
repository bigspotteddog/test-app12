node {
   def mvnHome
   stage('Preparation') {
      git 'https://github.com/bigspotteddog/test-app12.git'
      mvnHome = tool 'M3'
   }
   stage('Build') {
      deleteDir()
      checkout scm
      sh "'${mvnHome}/bin/mvn' clean package"
   }
   stage('Policy Evaluation') {
      nexusPolicyEvaluation advancedProperties: '', enableDebugLogging: false, failBuildOnNetworkError: false, iqApplication: selectedApplication('test-app'), iqScanPatterns: [[scanPattern: 'plans/aws.large.tfplan']], iqStage: 'develop', jobCredentialsId: ''
   }
   stage('Results') {
      archiveArtifacts 'target/*.jar'
   }
}
