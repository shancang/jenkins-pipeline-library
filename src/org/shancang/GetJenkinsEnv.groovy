//src/org/shancang/GetJenkinsEnv.groovy
def GetHome(args){
	if (args == "prod"){
		echo ${args}
	}else{

		echo "No"
	}
}