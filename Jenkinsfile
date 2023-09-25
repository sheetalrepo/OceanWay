pipeline {
    agent any
    stages {
	
	
        stage('One') {
            steps {
                echo 'Hi, this is Sheetal, testing pipeline code'
            }
        }
		
		
	    stage('Two'){
			steps {
				input('Do you want to proceed?')
			}
	    }
		
		
		
        stage('Three') {
                when {
                        not {
                         		branch "master"
                        }
                }
                steps {
					echo "Hello, I am in Stage 3 step"
                }
        }
		
		
		
        stage('Four') {
                parallel {
                        stage('Unit Test') {
                                steps{
                                        echo "Stage 4: Running the unit test..."
                                }
                        }
                }
        }
    }
}

