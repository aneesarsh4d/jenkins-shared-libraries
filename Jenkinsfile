@Library('my-shared-library') _

pipeline{
    agent any
    tools{
        jdk 'jdk25'
        maven 'maven3.10.0'
    }
    stages{
        stage('checkout'){
            steps{
                git branch: 'main', url: 'https://github.com/aneesarsh4d/shopping-cart.git'
            }
        }
        stage('build'){
            steps{
                mavenBuild()
            }
        }
        stage('post-build'){
            steps{
                echo "Build completed successfully"
            }
        }
    }
}
