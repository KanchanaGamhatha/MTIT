<?php
Namespace Acme\DemoBundle\Form;
use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\FormBuilderInterface;

class PersonType extends AbstractType
{
Public function buildForm(FormBuilderInterface $builder, array $options)
{
$builder -> add('email','email')->add('fullname','text')->add('submit','submit');
}
Public function getName()
{
return 'person';
}
}