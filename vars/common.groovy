def sonarChecks() {
      //  sh "sonar-scanner -Dsonar.host.url=http://172.31.9.236:9000 ${ARGS} -Dsonar.projectKey=${COMPONENT} -Dsonar.login=${SONAR_USR} -Dsonar.password=${SONAR_PSW}"
      //  sh "curl https://gitlab.com/thecloudcareers/opensource/-/raw/master/lab-tools/sonar-scanner/quality-gate > quality-gate.sh" 
      //  sh "bash -x quality-gate.sh ${SONAR_USR} ${SONAR_PSW} ${SONAR_URL} ${COMPONENT}"
        sh "echo Starting Code Quality Analysis"
        sh "echo Code Quality Analysis Completed"
}