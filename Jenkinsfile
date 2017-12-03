node {
def mvnHome
stage('Git') {
git 'https://github.com/TonyYuta/jenkinsak.git'
mvnHome = tool 'Maven_3.5.0'
}
stage('Maven') {
if (isUnix())  				{sh "'${mvnHome}/bin/mvn' clean findbugs:findbugs pmd:pmd pmd:cpd checkstyle:checkstyle test -Dmaven.test.failure.ignore=true"}
else 		  				{bat(/"${mvnHome}\bin\mvn" clean pmd:pmd pmd:cpd findbugs:findbugs checkstyle:checkstyle test -Dmaven.test.failure.ignore=true/)}
               }
stage('PMD') 				{step([$class: 'PmdPublisher', pattern: '**/pmd*.xml'])}
stage('CheckStyle')			{step([$class: 'CheckStylePublisher', pattern: '**/checkstyle*.xml'])}
stage('FindBugs') 			{step([$class: 'FindBugsPublisher', pattern: '**/findbugs*.xml'])}
stage('CPD') 				{step([$class: 'DryPublisher', pattern: '**/cpd.xml'])}
stage('TestNG') 			{step([$class: 'Publisher', testResults: '**/testng-results.xml'])}
}
