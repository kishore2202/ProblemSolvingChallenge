class KadaneAlgo
{
  for(int i=0;i<a.length;i++)
	{
		int meh=0;
		int msf=Integer.MIN_VALUE;
		meh=meh+a[i];
		if(meh<a[i])
		{
			meh=a[i];
		}
		if(msf<meh)
		{
			msf=meh;
		}
		return msf;
	}
}
