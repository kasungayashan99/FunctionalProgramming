object labsheet06q1 extends App{
	//initialize the alphabet
	val alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	//use to encrypt charactor,
	// given character convert to uppercase ,
	//find the index of the charactor, 
	//add key value to the index

	val Encrypt=(char:Char,key:Int,alphabet:String)=>alphabet((alphabet.indexOf(char.toUpper)+key)%alphabet.size);

	val Decrypt=(char:Char,key:Int,alphabet:String)=>alphabet((alphabet.indexOf(char.toUpper)-key)%alphabet.size);

	val cipher=(algo:(Char,Int,String)=>Char,str:String,key:Int,alphabet:String)=>str.map(algo(_,key,alphabet));

	val ct=cipher(Encrypt,"s",5,alph);

	val pt=cipher(Decrypt,"c",2,alph);

	println(ct);

	println(pt);
}




