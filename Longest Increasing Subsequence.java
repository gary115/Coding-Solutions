

<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Longest Increasing Subsequence | Practice | GeeksforGeeks </title>
		<link rel="icon" href="https://cdnpractice.geeksforgeeks.org/images/gfglogo.ico" type="image/x-icon" />
		<meta http-equiv="Content-type" content="text/html;charset=UTF-8">
		<meta charset="utf-8">
		<meta name="keywords" content="programming,coding,online, code online, online judge, practice, run code, test, expected outcome, programming competition, programming contest, online programming, online computer programming" />
		<meta name="description" content="Given a sequence, find the length of the longest increasing subsequence from a given sequence .
The longest increasing subsequence means to find a subsequence of a given sequence in which the subsequence&amp;#39;s elements are in sorted order, lowest
t ">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta property='og:image' content='https://cdnpractice.geeksforgeeks.org/images/gfg_200X200.png' />
		<meta property="og:image:type" content="image/png">
        <meta property="og:image:width" content="200">
        <meta property="og:image:height" content="200">

		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script src="https://cdnpractice.geeksforgeeks.org/js/practice1.1.js"></script>        
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="https://cdnpractice.geeksforgeeks.org/css/style-2.3.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"> 
       <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp" crossorigin="anonymous"> <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<meta property="og:title" content="Longest Increasing Subsequence | Practice | GeeksforGeeks "/>
<script>document.title="Longest Increasing Subsequence | Practice | GeeksforGeeks";var def_lang ="";</script>		<style>
            /*------------------Subtracting px based on the height of navbar-----------------*/
            .jumbotron{
                height: calc(100vh - 134px);
            }
            @media (min-width: 768px) and (max-width: 1114px){
   			   .jumbotron{
        			height: calc(100vh - 213px);
      			}
    		}
		    @media (min-width: 1115px) and (max-width: 1295px){
		       .jumbotron{
		           height: calc(100vh - 199px);
		        }
		    }
		    @media (min-width: 1296px) and (max-width: 1405px){
	      		.jumbotron{
	        		height: calc(100vh - 184px);
		        }
		    }
		    @media(min-width: 1406px){
      			.jumbotron{
	        		height: calc(100vh - 134px);
	      		}
		    }
		    @media (max-width: 767px){
	      		.jumbotron{
		        	height: auto;
		      	}
		    }
    	</style>
	 <script>
                  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
                  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
                  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
                  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

                  ga('create', 'UA-71763465-1', 'auto');
                  ga('send', 'pageview');

        </script>


			<link rel="canonical" href="https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence/0" />
	    <script async='async' src='https://www.googletagservices.com/tag/js/gpt.js'></script>
    <script>
      var googletag = googletag || {};
      googletag.cmd = googletag.cmd || [];
    </script>
    <script type='text/javascript'>
    var gptAdSlots = [];
        googletag.cmd.push(function() {
    var verticalLT270Sizes = googletag.sizeMapping().addSize([1500, 768], [[250, 250], [240, 400], [160, 600], [180, 150], [120, 600], [200, 200],[234, 60]])
                            .addSize([1025, 300], [[88,31], [120,20], [120,30], [120,240], [120,600], [160,600]])
                            .addSize([0, 0],[[88,31], [120,20], [120,30], [120,240],[120, 600]]).build();

    var verticalLT337Sizes = googletag.sizeMapping()
                            .addSize([1200, 768], [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]])
                            .addSize([728, 300], [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250]])
                            .addSize([0, 0], [160,600]).build();

    gptAdSlots[0] = googletag.defineSlot('/27823234/Practice/Vertical_W<270', [[250, 250], [240, 400], [160, 600], [180, 150], [120, 600], [200, 200],[234, 60]], 'div-gpt-ad-1523612657686-0').defineSizeMapping(verticalLT270Sizes).addService(googletag.pubads());
    gptAdSlots[1] = googletag.defineSlot('/27823234/Practice/Vertical_W<337', [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]], 'div-gpt-ad-1523612657686-1').defineSizeMapping(verticalLT337Sizes).addService(googletag.pubads());
    gptAdSlots[2] = googletag.defineSlot('/27823234/Practice/Vertical_W<337', [[88,31], [120,20], [120,30], [120,60], [120,90], [120,240], [120,600], [125,125], [160,600], [168,28], [168,42], [180,150], [200,200], [200,446], [216,36], [216,54], [220,90], [234,60], [240,133], [240,400], [250,250], [250,360], [292,30], [300,31], [300,50], [300,75], [300,100], [300,250], [300,600], [300,1050], [320,50], [320,100], [320,480], [336,280]], 'div-gpt-ad-1523612657686-2').defineSizeMapping(verticalLT337Sizes).addService(googletag.pubads());
    googletag.pubads().enableSingleRequest();
    googletag.pubads().collapseEmptyDivs();
    googletag.enableServices();
    });
    </script>
	   <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.0.3/cookieconsent.min.css" />
        <script src="//cdnjs.cloudflare.com/ajax/libs/cookieconsent2/3.0.3/cookieconsent.min.js"></script>
        <script>
        window.addEventListener("load", function(){
        window.cookieconsent.initialise({
        "palette": {
            "popup": {
              "background": "#3c404d",
              "text": "#d6d6d6"
            },
            "button": {
              "background": "#8bed4f"
            }
          },
          "theme": "classic",
            onStatusChange: function(status) {
            
            },
            law: {
              regionalLaw: false,
            },
            location: true,
            "content": {
            "message": "We use cookies to ensure you have the best browsing experience on our website. By using our site, you acknowledge that you have read and understood our <a href=\"https://www.geeksforgeeks.org/cookie-policy/\" class=\"cc-link\" target=\"_blank\">Cookie Policy</a> & ",
            "link": "Privacy Policy",
            "href": "https://www.geeksforgeeks.org/privacy-policy/"
            },
        cookie: {
        name : "geeksforgeeks_consent_status",
        }
        })});
    
        </script>
	</head>
	<body style="position:relative;">
    <nav id="social-share-btn" class="social-share-btn">
      <a href="https://www.linkedin.com/shareArticle?mini=true&url=https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence/0" class="social-sm-buttons"></a>
      <a href="https://plus.google.com/share?url=https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence/0" class="social-sm-buttons"></a>
      <a href="https://twitter.com/share?url=https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence/0" class="social-sm-buttons"></a>
      <a href="https://www.facebook.com/sharer.php?u=https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence/0" class="social-sm-buttons"></a>
      <a class="social-sm-buttons"><i class="material-icons">share</i></a>
    </nav>

<script>
  // toggle class and animate all social-share buttons on click share button.
  document.getElementById('social-share-btn').onclick = function() {
    this.classList.toggle('social-share-btn-enable');
  }
</script>

		<script>
		  window.fbAsyncInit = function() {
		    FB.init({
		      appId      : '534961220012939',
		      xfbml      : true,
		      version    : 'v2.5'
		    });
		  };

		  (function(d, s, id){
		     var js, fjs = d.getElementsByTagName(s)[0];
		     if (d.getElementById(id)) {return;}
		     js = d.createElement(s); js.id = id;
		     js.src = "//connect.facebook.net/en_US/sdk.js";
		     fjs.parentNode.insertBefore(js, fjs);
		   }(document, 'script', 'facebook-jssdk'));
		</script>
		<button id="scrollTopBtn" type="button" class="btn btn-success" style="background-color: #999;border-color:#999;right:80px;">
			<span class="glyphicon glyphicon-chevron-up"></span>
		</button>
		<div class="container-fluid">
			<div class="row whiteHeaderStripBar">
				<div class="col-lg-3 col-md-2 col-sm-3 col-xs-12">
					<a class="logo" href="/">Practice</a><b style="color:#005C00;">&nbsp;&nbsp;&nbsp;BETA</b>
				</div>
				<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12" style="border-width:0px;">    
		                <script>
			  				(function() {
							    var cx = '005855190823060106138:ggjtcjog1xu';
							    var gcse = document.createElement('script');
							    gcse.type = 'text/javascript';
							    gcse.async = true;
							    gcse.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') +
							        '//cse.google.com/cse.js?cx=' + cx;
							    var s = document.getElementsByTagName('script')[0];
							    s.parentNode.insertBefore(gcse, s);
							  })();
						</script>
						<gcse:search></gcse:search>
                </div>
				<div class="col-lg-6 col-md-7 col-sm-5 col-xs-12 text-center" >
					<hgroup class="text-right" style="margin-top:5px;">   
                      <a class="products" href="https://practice.geeksforgeeks.org/batch/Sudo Placement/">Sudo Placement</a>
					</hgroup>
					<div class="text-right" style="font-size: 18px;display: none;" id="userHandleHeader">
                        <a style="color:#0D7525;" href="https://auth.geeksforgeeks.org/?to=https%3A%2F%2Fpractice.geeksforgeeks.org%2Fproblems%2Flongest-increasing-subsequence%2F0">Login/Register</a>
                    </div>
				</div>
			</div>
			<div class="row">
				<nav class="navbar navbar-default" style="margin-bottom:5px;min-height:38px;">
					<div class="navbar-header" style="background-color: #fff;">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					</div>
					<div id="navbar" class="navbar-collapse collapse" style="padding:0;">
						<ul class="menu nav navbar-nav" style="margin:0px;">
							<div class="col-sm-offset-2 col-xs-12 col-sm-2 ">
								<div class="row">
                                    <li class="dropdown col-xs-12 col-sm-12 text-center navhover" style="padding:0;">
                                        <a href="#" class="dropdown-toggle diff " style="font-size: 15px; color: white; hover:none;padding:8px;" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <b>Level</b> <span class="caret"></span></a>
                                            <ul class="dropdown-menu" style="margin: 0;padding: 0;width:100%;">
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/School/0/0/"><b>School</b></a></li>
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/Basic/0/0/"><b>Basic</b></a></li>
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/Easy/0/0/"><b>Easy</b></a></li>
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/Medium/0/0/"><b>Medium</b></a></li>
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/Hard/0/0/"><b>Hard</b></a></li>

                                            </ul>
                                    </li>
								</div>
							</div>
							<div class="col-xs-12 col-sm-8">
								<div class="row">
                                    <li class="dropdown col-xs-12 col-sm-2 text-center navhover" style="padding:0;">
                                       </i><a href="#" class="dropdown-toggle diff" style="font-size: 15px; color: white; hover:none;padding:8px;" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <b><i class="fas fa-info highlight"></i>&nbsp&nbspTracks</b> <span class="caret"></span></a>
                                            <ul class="dropdown-menu" style="margin: 0;padding: 0;align: left !important;width:100%;">
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/tracks/Placement/"><b>Placement</b></a></li>
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/tracks/CPP/"><b>CPP</b></a></li>
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/tracks/Java/"><b>Java</b></a></li>
                                                <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/featured.php"><b>Featured Problems</b></a></li>
                                            </ul>
                                    </li>
									<li class="col-xs-12 col-sm-2 text-center navhover" style="padding:0px;"><a class="wtext diff" style="padding:8px;" href="/recent.php">What's New</a></li>
									<li class="col-xs-12 col-sm-2 text-center navhover" style="padding:0px;"><a class="wtext diff" style="padding:8px;" href="/contests/">Contests</a></li>
									<li class="dropdown col-xs-12 col-sm-2 text-center navhover" style="padding:0;">
										<a href="#" class="dropdown-toggle diff" style="font-size: 15px; color: white; hover:none;padding:8px;" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> <b>Help</b> <span class="caret"></span></a>
<ul class="dropdown-menu" style="margin: 0;padding: 0;width:100%;">
    <li><a style="background-color: #4CB96B; color:white; font-size: 14px;border: 1px solid #fff;" href="/faq.php"><b>FAQ</b></a>
    </li>
    <li><a style="background-color: #4CB96B; color:white; font-size: 14px;cursor:pointer;border: 1px solid #fff;" data-target="#reportIssueHeader" data-toggle="modal"><b>Report An Issue</b></a>
    </li>
</ul>

		             				</li>
		             			</div>
		             		</div>
						</ul>
					</div>
				</nav>
			</div>

<div class="modal fade" id="commentModalHeader" role="success">
    <div class="modal-dialog ">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Message </h4>
        </div>
        <div class="modal-body">
            <div class="form-group">
         <div class="modal-body">
              <p>Error</p>
            </div>
            </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">OK</button>
        </div>
      </div>
    </div>
</div>


<div class="modal fade" id="reportIssueHeader" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
                <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title text-center" id="myModalLabel">Note: For issues in your code/test-cases, please use Comment-System of that particular problem.</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                          <label  class="col-sm-1 control-label" for="inputTestCase">Details</label>
                            <div class="col-sm-11">
                              <textarea id="issueDescription" class="form-control" rows="7" cols="100" name="issueDescription" ></textarea>
                          </div>
                        </div>
                  </form>
              </div>
                <div class="modal-footer">

                        <button type="button" class="btn btn-default" data-dismiss="modal" style="float:left;">Cancel</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal" id="reportIssueHeaderMail" style="float:right;">Send</button>
                </div>
        </div>
        </div>
</div>

<script>
$(document).ready(function() { 
                $('.dropdown-toggle').dropdown(); 
                $.ajax({
                        type: "POST",
                        url: "/ajax/fetchUserDetails.php",
                        data: {},
                        success: function(result) {
                            var response = JSON.parse(result);
                            if (response["status"] == 1) {
                                $('#userHandleHeader').html(response["userHandle"]);
                            }
                        },
                        complete: function(result) {
                            $('#userHandleHeader').show();
                        }
                    });

                });


               $("#reportIssueHeaderMail").click(function(){
                  if($("#issueDescription").val()=="") {
                      alert("Please describe your issue.");
                      return false;
                }
                $.ajax({
                    type:"POST",
                    url:"/ajax/testCasesMail.php",
                    data:{requestType:'reportIssueHeader',issue:$("#issueDescription").val(),requestUrl:window.location.href},
                    success:function(data){
                         $('#commentModalHeader .modal-body p').text( data );
                         $('#commentModalHeader').modal('show');
                    }
                });

              });

</script>


    <script> var isDefaultCode = 0;</script>
    <script> var contestId = 0;</script>
    <script> var userId = 204036;</script>
    <link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
    <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

    
    <div class="fullScreen" style="z-index:1000;overflow-x:hidden;display:none">
      <div class="leftDiv split" style="overflow-y:auto;width:48%;padding:10px 20px 100px 20px;outline: 10px solid #f1f1f1;">
          <div class="problemTitle" style="font-weight:bold; font-size:20px">Longest Increasing Subsequence              <a style="cursor:pointer" id="half" class="screen-resize">
                  <span class="pull-right glyphicon glyphicon-resize-small"></span>
          </a>
          </div>
      </div>
      <div class="rightDiv split" style="overflow-y:auto;width:52%;padding:10px 20px 100px 35px"></div>
    </div>
   
	<div class="row fullPageDiv">
                                          <div class="col-xs-12 col-sm-2 text-center leftTreeDiv">
                        <!-- get top 10 company and problem tags name here -->

<div class="whiteBgColor">
	<ul class="tree text-left">
		<li class="branch">
			<i class="indicator glyphicon glyphicon-minus-sign toggleTree"></i>
			<a class="toggleTree" >Popular Company Tags</a>
			<ul class="treeElements">
		        
			      <li><a href="/company/Amazon/">Amazon</a></li>
                              <li><a href="/company/Microsoft/">Microsoft</a></li>
                              <li><a href="/company/Oracle/">Oracle</a></li>
                              <li><a href="/company/Samsung/">Samsung</a></li>
                              <li><a href="/company/Adobe/">Adobe</a></li>
                              <li><a href="/company/Synopsys/">Synopsys</a></li>
                              <li><a href="/company/Infosys/">Infosys</a></li>
                              <li><a href="/company/Cisco/">Cisco</a></li>
                              <li><a href="/company/Wipro/">Wipro</a></li>
                              <li><a href="/company/Ola-Cabs/">Ola-Cabs</a></li>
							  <li><a href="/company/Morgan-Stanley/">Morgan-Stanley</a></li>
							  <li><a href="/company/Goldman-Sachs/">Goldman-Sachs</a></li>


			<a href="/company-tags" style="color:#4cb96b;text-shadow: 1px 1px #ccc;">show more</a>
    	    </ul>
		</li>
	</ul>
</div>
  	<div style="margin:10px 0px;">
       <!-- /27823234/Practice/Vertical_W<270 -->
    <div id='div-gpt-ad-1523612657686-0'>
    <script>
    googletag.cmd.push(function() { googletag.display('div-gpt-ad-1523612657686-0'); });
    </script>
    </div>

	</div>
<div class="whiteBgColor">
	<ul class="tree text-left">
		<li class="branch">
			<i class="indicator glyphicon glyphicon-minus-sign toggleTree"></i>
			<a class="toggleTree">Popular Topic Tags</a>
			<ul class="treeElements">
			      <li><a href="/topics/maths/">Maths</a></li>
                              <li><a href="/topics/array/">Array</a></li>
                              <li><a href="/topics/Dynamic-Programming/">Dynamic-Programming</a></li>
                              <li><a href="/topics/Greedy-Algorithm/">Greedy-Algorithm</a></li>
                              <li><a href="/topics/hashing/">Hashing</a></li>
                              <li><a href="/topics/tree/">Tree</a></li>
                              <li><a href="/topics/bit-algorithm/">Bit-Algorithm</a></li>
                              <li><a href="/topics/matrix/">Matrix</a></li>
                              <li><a href="/topics/backtracking/">Backtracking</a></li>
                              <li><a href="/topics/Operating Systems/">Operating System</a></li>
							  <li><a href="/topics/Linked-List/">Linked-List</a></li>
							  <li><a href="/topics/Graph/">Graph</a></li>

		        <a href="/topic-tags" style="color:#4cb96b;text-shadow: 1px 1px #ccc;">show more</a>
    	    </ul>
		</li>
	</ul>
</div>
<br>

    </div>
   
    <div class="col-sm-7 col-xs-12" style="padding-right:2px; padding-left:2px;">
        <div class="container-fluid">
        <div class="row">
            <div id="border" class="well whiteBgColor">
			    <div class="row" style=" padding-bottom: 5px; border-bottom:1px solid silver;">		
			        <div class="col-lg-12" style="font-size:25px;">
			            <strong>Longest Increasing Subsequence                                                    </strong>
				        				    </div>
 
                    <div class="col-sm-8 col-xs-12">                          
                        <h5 style="float:left; margin-top: 0px;">
                            Submissions:   
                                <a style="color:green" href="/problem_submissions.php?pid=134">
                                53248                                </a>
                                 
                            &ensp; Accuracy: <p style="color:green; display:inline">28.09%</p>
                                                            &ensp; Difficulty: <u><a href="https://practice.geeksforgeeks.org/Medium/0/0/" style="color:green; display:inline;">Medium</a></u> 
                             
                         </h5>
                    </div>
                                    </div>
				<div class="row">
                    				        <div class="col-md-6">
                                                            <button type="button" class="btn btn-warning btn-xs showTag" style="border-radius:3px;">Show Topic Tags</button>&nbsp;</a>
                                <button type="button" class="btn btn-warning btn-xs hideTag" style="border-radius:3px;display:none;">Hide Topic Tags</button>&nbsp;</a> 
                                                                    <a href="/topics/Dynamic Programming/" style="float:left; text-decoration:none;">
                                    <button type="button" class="btn btn-info btn-xs topicTags" style="display:none">Dynamic Programming                                    </button>&nbsp;</a>
                                    				        </div>

                        <div class="col-md-6">
                                                            <a href="/company/Amazon/" style="float:right; text-decoration:none;"> &nbsp; 
                                <button type="button" class="btn btn-info btn-xs">Amazon</button></a>
                                                                <a href="/company/BankBazaar/" style="float:right; text-decoration:none;"> &nbsp; 
                                <button type="button" class="btn btn-info btn-xs">BankBazaar</button></a>
                                                                <a href="/company/Paytm/" style="float:right; text-decoration:none;"> &nbsp; 
                                <button type="button" class="btn btn-info btn-xs">Paytm</button></a>
                                                                <a href="/company/Samsung/" style="float:right; text-decoration:none;"> &nbsp; 
                                <button type="button" class="btn btn-info btn-xs">Samsung</button></a>
                                				        </div>
                        				</div>
			    <br>

                <div class="problemQuestion">
                    <p><span style="font-size:20px">Given a sequence, find the length of the longest increasing subsequence from a given sequence .<br />
The longest increasing subsequence means to find a subsequence of a given sequence in which the subsequence&#39;s elements are in sorted order, lowest<br />
to highest, and in which the subsequence is as long as possible. This subsequence is not necessarily contiguous, or unique.</span></p>

<p><span style="font-size:20px"><strong>Note:</strong> Duplicate numbers are not counted as increasing subsequence.</span></p>

<p><span style="font-size:20px">For example:<br />
&nbsp;length of LIS for&nbsp;<br />
{ 10, 22, 9, 33, 21, 50, 41, 60, 80 } is 6 and LIS is {10, 22, 33, 50, 60, 80}.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:20px"><strong>Input:</strong></span></p>

<p><span style="font-size:20px">The first line contains an integer T, depicting total number of test cases.&nbsp;<br />
Then following T lines contains an integer N depicting the size of array and next line followed by the value of array.</span></p>

<p><br />
<span style="font-size:20px"><strong>Output:</strong></span></p>

<p><span style="font-size:20px">Print the Max length of the subsequence in a separate line.</span></p>

<p><br />
<span style="font-size:20px"><strong>Constraints:</strong></span></p>

<p><span style="font-size:20px">1 &le; T &le; 100<br />
1 &le; N &le; 1000<br />
0 &le; A[i] &le; 300<br />
<br />
<strong>Example:</strong></span></p>

<div style="background:#eee;border:1px solid #ccc;padding:5px 10px;"><span style="font-size:20px">Input<br />
1<br />
16<br />
0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15<br />
Output<br />
6</span></div>
                     
                        <h4>** For More Input/Output Examples Use <a href="#ExpectOP">'Expected Output'</a> option **</h4> 
                                        </div>

                                        <a href="https://auth.geeksforgeeks.org/user/shef5/practice/">Author: shef5</a><br>
                                                
                    <div class="row">
                        <div class="col-sm-12 text-right">
							                                    <a href="/problem_submissions.php?pid=134"><button class="btn btn-primary">All submissions</button></a>
                                                                    <a href="/problem_submissions.php?pid=134&isSolved=ALL&lang=ALL&user=Self"><button class="btn btn-primary">My submissions</button></a>
                                	
                                <a style="font-size:15px;" class="btn btn-info" href="/editorial.php?pid=134" 
                                                                             onclick="return confirm('We strongly recommend to solve this problem by your own before seeing its editorial.\n Do you really want to see its editorial?')" 
                                         >Editorial</a> 
                                						</div>
                    </div>
            </div>
        </div>

        <div class="row editorTop">                       
            <h4 style="float:right;margin-right:15px"><u>
                </u> 
            </h4>
        </div>

        
            <div class="mainRightDiv">
                <div id="border" class="row whiteBgColor" style="display: block;padding: 10px;margin-top: 10px">
                    <div class="col-sm-3 col-xs-6">
                        <select class="themes form-control">
                            <option class="themeLight">Theme Light</option>
                            <option class="themeDark">Dark</option>
                            <option class="themeMonokai">Monokai</option>
                            <option class="themeGfG">GeeksforGeeks</option>
                        </select>
                    </div>
                    <div class="col-sm-3 col-xs-6">
                        <select id="languageDropdown" class="form-control">
                                                            <option class="lang" style="display:" value="c">C (gcc 5.4)</option>
                                <option class="lang" style="display:" value="cpp">C++ (g++ 5.4)</option>
                                <option class="lang" style="display:" value="csharp">C#</option>
                                <option class="lang" style="display:" value="java">Java (1.8)</option>
                                <option class="lang" style="display:" value="python3">Python 3</option>
                                 
                            <script> var displayLang = ""</script>
                        </select>
                    </div>
                    <div class="col-sm-3 col-xs-12" style="float:right; padding: 5px;">
                    <a id="full" class="screen-resize" data-toggle="tooltip" title="Click to Split" href="javascript:void(0)" style="float:right; padding: 5px;">
                        <span class="glyphicon glyphicon-resize-full"></span>
                    </a>
                    <a id="zoom" data-toggle="tooltip" title="Click to Full" href="javascript:void(0)" style="float:right; padding: 5px;">
                        <span class="glyphicon glyphicon-fullscreen"></span>
                    </a>
                    <a id="resetEditor" title="Reset Code" style="float:right; padding:5px;">
                        <span class="glyphicon glyphicon-refresh"></span>
                    </a>
                                            <a href="https://auth.geeksforgeeks.org/edit-profile.php" title="Change Default Code" style="float:right; padding:5px;">
                            <span class="glyphicon glyphicon-cog"></span>
                        </a>
                                       </div>
                </div>
                                    <script>
                        var isDefaultCode = 0;
                        var currentUser = 'garima115';
                        var sampleTestCases = `1
16
0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15`;
                        var track = '';
                    </script>

                                            <script> 
                            var def_lang = "";
                        </script>
                         				

                <div class="row">
                    <div id="border">
                        <div class="editorBlock">    
                            <pre id="editor">
                                                            </pre>
                        </div>
                        <script type="text/javascript">
                            var pid = "134";
                            var userid = "204036";
                        </script>
                        <script src="https://cdnpractice.geeksforgeeks.org/ace/src-min-noconflict/ace.js" type="text/javascript" charset="utf-8"></script>
                        <script src="https://cdnpractice.geeksforgeeks.org/ace/src-min-noconflict/ext-language_tools.js"></script>
                        <script>window.urlCdn = "https://cdnpractice.geeksforgeeks.org";</script>
                        <script src="https://cdnpractice.geeksforgeeks.org/js/problem-page-combo-2.15.js"></script>
                    </div>
                </div>

                <div id="border" class="row" style="display: block; padding: 10px; background: #ebebeb; margin-top: 1px">
                    <div class="col-sm-4 col-xs-12">
                        <input style="float: left; margin: 0px !important" type="checkbox" id="customInputCheckbox">
                        <span style="float: left; padding-left: 10px;">Test against custom input</span> 
                    </div>
                    <div class="col-sm-6 col-xs-12" style="float:right;">
                                                    <input style="float: right; font-size:13px; margin-top:0px !important" type="submit" class="btn btn-primary" id="testRun" value="Compile & Test">
                            <input style="float: right; font-size:13px; margin-top:0px !important" type="submit" class="btn btn-danger" id="run" value="Submit">
                                                        <input style="float:right;font-size:13px;margin-top:0px !important" type="submit" class="btn btn-success" id="expectedRun" value="Expected Outcome">
                                                </div>
                </div>
                </br>
                                    <div class="row" style="margin-top: 10px;">
                        <div class="out"><pre style="font-size:17px;"></pre></div>
                    </div>
                                </div>	
                    <br>
                    <b>Need help with your code? Please use </b><a href="https://ide.geeksforgeeks.org">ide.geeksforgeeks.org</a><b>, generate link and share the link here.</b>
            <br><br>

            <div style="display:flex">
                <button id="comment" class="action-button" style="width:45%;cursor: pointer;margin-right:10% padding:1%;box-shadow: 0 2px 5px 0 rgba(0,0,0,0.4), 0 6px 20px 0 rgba(0,0,0,0);border-color: #4cb96b;border-radius: 4px;">Load Comments</button>
            </div>

        </div>
    </div>
   
     
            <div class="col-sm-3 col-xs-12" id="col_sidebar" style="">
            
<div class="border" id="sidebar" style="padding-right:0px;">
      <!-- /27823234/Practice/Vertical_W<337 -->
    <div id='div-gpt-ad-1523612657686-1'>
    <script>
    googletag.cmd.push(function() { googletag.display('div-gpt-ad-1523612657686-1'); });
    </script>
    </div>


  <div id="leaderBoard">
    <div class="row mainLeaderBoard">
    <div class="col-sm-12">
        <a class="whiteLink btn btn-success hoverDarkGreen" href="/ranking.php" data-toggle="tooltip" data-placement="top" title="Click to view Overall Leaderboard" style="color:white;display:block;">Leaderboard (Overall) <span class="glyphicon glyphicon-forward"></span></a>
    </div>
    <div class="col-sm-12">
        <ul class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active text-center" style="width:33.33%;">
                <a class="whiteBorder" href="#weekly_score" aria-controls="weekly_score" role="tab" data-toggle="tab" style="margin:0;">Weekly</a>
            </li>
            <li role="presentation" class="text-center" style="width:33.33%;">
                <a class="whiteBorder" href="#monthly_score" aria-controls="monthly_score" role="tab" data-toggle="tab" style="margin:0;">Monthly</a>
            </li>
            <li role="presentation" class="text-center" style="width:33.33%;">
                <a class="whiteBorder" href="#overall" aria-controls="overall" role="tab" data-toggle="tab" style="margin:0;">Overall</a>
            </li>
          </ul>
          <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="weekly_score">
                <table class="table whiteBgColor" style="margin-bottom:0px;">
                    <tbody>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/Apoorv Shrivastav/practice/">
                                            Apoorv Shrivastav                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        173                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/MANAN Dhyani/practice/">
                                            MANAN Dhyani                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        159                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/sush_i/practice/">
                                            sush_i                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        99                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/KAPILMANGAL/practice/">
                                            KAPILMANGAL                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        94                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/kiki4114/practice/">
                                            kiki4114                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        90                                    </td>
                                </tr>
                                            </tbody>
                </table>
            </div>
            <div role="tabpanel" class="tab-pane" id="monthly_score">
                <table class="table whiteBgColor" style="margin-bottom:0px;">
                    <tbody>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/Apoorv Shrivastav/practice/">
                                            Apoorv Shrivastav                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        68                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/MANAN Dhyani/practice/">
                                            MANAN Dhyani                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        66                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/starChasing/practice/">
                                            starChasing                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        62                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/Anirudh Sharma 2/practice/">
                                            Anirudh Sharma 2                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        52                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/ApoorvJoshi/practice/">
                                            ApoorvJoshi                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        48                                    </td>
                                </tr>
                                            </tbody>
                </table>
            </div>
            <div role="tabpanel" class="tab-pane" id="overall">
                <table class="table whiteBgColor" style="margin-bottom:0px;">
                    <tbody>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/akhayrutdinov/practice/">
                                            akhayrutdinov                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        4721                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/Quandray/practice/">
                                            Quandray                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        3790                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/sanjay05/practice/">
                                            sanjay05                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        3668                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/Ibrahim Nash/practice/">
                                            Ibrahim Nash                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        3664                                    </td>
                                </tr>
                                                        <tr style="border:1px solid #6AA84F;padding:2px;">
                                    <td style="text-align:center;width:70%;">
                                        <a href="https://auth.geeksforgeeks.org/user/surbhi_7/practice/">
                                            surbhi_7                                        </a>
                                    </td>
                                    <td style="text-align:center;width:30%;">
                                        2776                                    </td>
                                </tr>
                                            </tbody>
                </table>
            </div>
          </div>
    </div>
</div>
<script>
    var weeklyTopUsers = ["Apoorv Shrivastav","MANAN Dhyani","sush_i","KAPILMANGAL","kiki4114"];
    var monthlyTopUsers = ["Apoorv Shrivastav","MANAN Dhyani","starChasing","Anirudh Sharma 2","ApoorvJoshi"];
    var overallTopUsers = ["akhayrutdinov","Quandray","sanjay05","Ibrahim Nash","surbhi_7"];
</script>
  </div>
<br>
  
    <div style="margin:6px 0px;">
    <!-- /27823234/Practice/Vertical_W<337 -->
        <div id='div-gpt-ad-1523612657686-2'>
            <script>
                 googletag.cmd.push(function() { googletag.display('div-gpt-ad-1523612657686-2'); });
            </script>
        </div>
  </div>


  </div>


<div class="row">
    <div class="col-sm-12">
      <a href="/recentComments.php" class="btn btn-success form-control" type="button" style="background-color:#4CB96B;font-size: 16px;">Recent Comments</a>
    </div>
</div>
</div>

<script>
    $(window).load(function(){
        var userRow = '<tr id="userRow" style="background-color:#b3ffb3">';
        userRow += '<td style="text-align:center;width:60%;border:1px solid #6AA84F;padding:2px;">';
        userRow += '<a href="https://auth.geeksforgeeks.org/user/'+'garima115'+'/practice/">'+'garima115'+'</a>';
        userRow += '</td>';
        userRow += '<td id="userScore" style="width:20%;text-align:center;border:1px solid #6AA84F;padding:2px;">'+''+'</td>';
        userRow += '</tr>';
        if ( overallTopUsers.indexOf('garima115') <= -1 ) {
            $('body').find('#overall').find('table').find('tbody').append(userRow);
            $('body').find('#overall').find('table').find('tr#userRow').find('td#userScore').html('94');
        }
        if ( weeklyTopUsers.indexOf('garima115') <= -1) {
            $('body').find('#weekly_score').find('table').find('tbody').append(userRow);
            $('body').find('#weekly_score').find('table').find('tr#userRow').find('td#userScore').html('0');
        }
        if ( monthlyTopUsers.indexOf('garima115')<= -1) {
            $('body').find('#monthly_score').find('table').find('tbody').append(userRow);
            $('body').find('#monthly_score').find('table').find('tr#userRow').find('td#userScore').html('0');
        }

        $('.mainLeaderBoard').find("td:contains('garima115')").parent().css('background-color','#b3ffb3');
    }); 
  </script>

        </div> 
                </div>
    <div class="container-fluid">
        <div class="col-sm-offset-2 col-sm-7 col-xs-12" style="margin-top: 10px;">
                <div class="col-sm-12 col-xs-12">
                    <div id="disqus_thread"></div>
                        <script>
                         /**
                             *  RECOMMENDED CONFIGURATION VARIABLES: EDIT AND UNCOMMENT THE SECTION BELOW TO INSERT DYNAMIC VALUES FROM YOUR PLATFORM OR CMS.
                             *  LEARN WHY DEFINING THESE VARIABLES IS IMPORTANT: https://disqus.com/admin/universalcode/#configuration-variables
                             */
                            
                            var disqus_config = function () {
                                this.page.url = 'https://practice.geeksforgeeks.org/problem-page.php?pid=134';  // Replace PAGE_URL with your page's canonical URL variable
                                this.page.identifier = 'problem-page.php?pid=134'; // Replace PAGE_IDENTIFIER with your page's unique identifier variable
                                this.callbacks.onNewComment = [function(comment) { 
                                    var author = 'shef5';
                                    var problem ='Longest Increasing Subsequence'; 
                                    var requestType = 'notifyProblemAuthor';
                                    var problemLink = window.location.href;
                                    var sendMail = '';  // don't send mail if problem is older than a month
                                    if(sendMail) {
                                        $.ajax({
                                          type:"POST",
                                          url:"/ajax/monitorDisqusAjax.php",
                                          data: {requestType: requestType, author: author, problemLink: problemLink, problem: problem, comment: comment},
                                          dataType: "json",
                                       });
                                   }
                                }];
                            };
    
                            $(function() {
                                var disqus_div = $("#disqus_thread");
                                if (disqus_div.size() > 0 ) {
                                    var ds_loaded = false,
                                    top = disqus_div.offset().top, // WHERE TO START LOADING
                                    disqus_data = disqus_div.data(),
                                    check = function(){
                                        if ( !ds_loaded && $(window).scrollTop() + $(window).height() > top ) {
                                            ds_loaded = true;
                                            for (var key in disqus_data) {
                                                if (key.substr(0,6) == 'disqus') {
                                                    window['disqus_' + key.replace('disqus','').toLowerCase()] = disqus_data[key];
                                                }
                                            }
                                    
                                            var dsq = document.createElement('script'); 
                                            dsq.type = 'text/javascript';
                                            dsq.async = true;
                                            dsq.src = 'https://geeksforgeekspractice.disqus.com/embed.js';
                                            (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
                                        }
                                $("#comment").css("display", "none");
                                    };

                                $(window).scroll(check);
                                check();
                            }
                        });
                    </script>
                    <noscript>Please enable JavaScript to view the <a href="https://disqus.com/?ref_noscript" rel="nofollow">comments powered by Disqus.</a></noscript>
                </div>
            </div>
        </div>
    </div>
        <!--Edit Modal -->
    <div class="modal fade" id="editProblemModal" >
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Select Operation Mode</h4>
                </div>
                <div class="modal-body">
                    <p>Please choose 'ReadOnlyMode' if you needn't to 'Edit' the problem e.g. viewing OJ's solution, TestCase Files (TCFs), TimeLimit etc.</p>
                </div>
                <div class="modal-footer">
                    <a href="/addEditProblem.php?problemId=134" class="btn btn-warning" role="button" target="_blank">EditMode</a>
                    <a href="/addEditProblem.php?problemId=134&viewMode=1" class="btn btn-info" role="button" target="_blank">ReadOnlyMode</a>
                </div>
            </div>
        </div>
    </div>
    
    <div class="modal fade" id="customInputTestModal" >
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Enter Custom Input</h4>
                </div>
                <div class="modal-body">
                    <p>Please note that Custom Input(s) should be mentioned in the same order (format) as stated in the problem description.</p>
                    <textarea  id="testArea" rows="4" style="width:100%;" maxlength="15000" ></textarea>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-default" type="button" data-dismiss="modal">Close</a>
                    <button class="btn btn-warning" type="button" id="customInputTestRun">Run Code</a>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="customInputExpectedModal" >
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Enter Custom Input</h4>
                </div>
                <div class="modal-body">
                    <p>Please note that Custom Input(s) should be mentioned in the same order (format) as stated in the problem description.</p>
                    <textarea  id="expectedArea" rows="4" style="width:100%;" maxlength="15000" ></textarea>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-default" type="button" data-dismiss="modal">Close</a>
                    <button class="btn btn-warning" type="button" id="customInputExpectedRun">See Output</a>
                </div>
            </div>
        </div>
    </div>

    
</div>
		</div>

<footer>
    <div id="container-g4g-footer">

        <div id="footer">
            <div class="logo">
                <ul class="gfg-logo-ul">
                    <li>
                        <a href="https://www.geeksforgeeks.org/">
                            <img src="https://d3qt53jevtbvi2.cloudfront.net/common/GeeksforGeeksLogoFooterSmall.png" alt="GeeksforGeeks">
                        </a>
                    </li>
                </ul>
                <ul class="social-ul">
                    <li>710-B, Advant Navis Business Park,</li>
                    <li>Sector-142, Noida, Uttar Pradesh - 201305</li>
        <li>feedback@geeksforgeeks.org</li>
                </ul>
                
            </div>
            <div class="footer-column">
                <ul>
                    <li><b>COMPANY</b></li>
                    <li><a href="https://www.geeksforgeeks.org/about/">About Us</a></li>
                    <li><a href="https://www.geeksforgeeks.org/careers/">Careers</a></li>
                    <li><a href="https://www.geeksforgeeks.org/privacy-policy/">Privacy Policy</a></li>
                    <li><a href="https://www.geeksforgeeks.org/about/contact-us/">Contact Us</a></li>
                </ul>
            </div>


            <div class="footer-column">
                <ul>
                    <li><b>LEARN</b></li>
                    <li><a href="https://www.geeksforgeeks.org/fundamentals-of-algorithms/">Algorithms</a></li>
                    <li><a href="https://www.geeksforgeeks.org/data-structures/">Data Structures</a></li>
                    <li><a href="https://www.geeksforgeeks.org/category/program-output/">Languages</a></li>
                    <li><a href="https://www.geeksforgeeks.org/articles-on-computer-science-subjects-gq/">CS Subjects</a></li>
                    <li><a href="https://www.youtube.com/geeksforgeeksvideos/">Video Tutorials</a></li>
                </ul>
            </div>

            <div class="footer-column">
                <ul>
                    <li><b>PRACTICE</b></li>
                    <li><a href="https://practice.geeksforgeeks.org/company-tags/">Company-wise</a></li>
                    <li><a href="https://practice.geeksforgeeks.org/topic-tags/">Topic-wise</a></li>
                    <li><a href="https://practice.geeksforgeeks.org/contests/">Contests</a></li>
                    <li><a href="https://practice.geeksforgeeks.org/subjective-page.php">Subjective Questions</a></li>
                    <li><a href="https://practice.geeksforgeeks.org/faq.php">How to begin?</a></li>
                </ul>
            </div>

            <div class="footer-column">
                <ul>
                    <li><b>CONTRIBUTE</b>
                    <li><a href="https://www.geeksforgeeks.org/contribute/">Write an Article</a></li>
                    <li><a href="https://www.geeksforgeeks.org/write-interview-experience/">Interview Experience</a></li>
                    <li><a href="https://www.geeksforgeeks.org/internship/">Internships</a></li>
                    <li><a href="https://www.geeksforgeeks.org/how-to-contribute-videos-to-geeksforgeeks/">Videos</a></li>
                </ul>
            </div>

        </div>

        <div class="footer-bottom-div footer-bottom-social">
    <ul class="social-ul" style="padding-left: 0px;">
                    <li>
                        <a class="social-link" href="https://www.facebook.com/geeksforgeeks.org/"><div class="social-img-div"></div></a>
                        <a class="social-link" href="https://in.linkedin.com/company/geeksforgeeks"><div class="social-img-div"></div></a>
                        <a class="social-link" href="https://play.google.com/store/apps/details?id=free.programming.programming&amp;hl=en"><div class="social-img-div"></div></a>
                        <a class="social-link" href="https://twitter.com/geeksforgeeks"><div class="social-img-div"></div></a>
                        <a class="social-link" href="https://www.youtube.com/geeksforgeeksvideos"><div class="social-img-div"></div></a>
                    </li>
                </ul>
  </div>
  <div class="footer-bottom-div">
            @geeksforgeeks, <a href="https://creativecommons.org/licenses/by-sa/4.0/" style="color:#fff;">Some rights reserved</a>
        </div>

    </div>
</footer>

<script async type="text/javascript" src="//cdn.fancybar.net/ac/fancybar.js?zoneid=1502&serve=C6ADVKE&placement=geeksforgeeks" id="_fancybar_js"></script>
	</body>
	

	
</html>
    
    <style>
        .aceLineHighlighter {
            position:absolute;
            background:#4286f4;
            z-index:20
        }

        .fullScreen {
          position: fixed;
          z-index: 1000;
          width: 100vw;
          height: 100vh;
          top: 0;
          left: 0;
          background: #fff;
          display:none;
        }

        .split {
          float: left;
          height: 100vh;
        }
    </style>

    <script>
        $(".showTag").click(function(){
                 $(".showTag").css('display','none'); 
                 $(".hideTag").css('display','');
                 $(".topicTags").css('display','');
                
        });
        $(".hideTag").click(function(){
                 $(".hideTag").css('display','none'); 
                 $(".showTag").css('display','');
                 $(".topicTags").css('display','none');
                
        });
    </script>


