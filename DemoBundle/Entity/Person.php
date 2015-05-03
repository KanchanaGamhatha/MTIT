<?php
namespace Acme\DemoBundle\Entity;

class Person
{
	/** 
	@Assert\NotBlank() 
	@Assert\Email() 
	*/ 
	protected $email;
	
	/** 
	@Assert\NotBlank() 
	*/ 
	protected $fullname;
	
	public function getEmail()
	{
	return $this -> email;
	}
	public function setEmail($email)
	{
	$this -> email = $email;
	}
	public function getFullname()
	{
	return $this ->fullname;
	}
	public function setFullname($fullname)
	{
	$this -> fullname = $fullname;
	}
}
?>