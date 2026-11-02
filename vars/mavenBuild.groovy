def call(){
	stage('build using mavenBuild function'){
		echo "Building the package using function call in shared library"
		sh 'mvn clean package'
	}
}
