package net.mogoweb.samples.test;

import net.mogoweb.samples.HelloAndroidActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class HelloAndroidTest extends
		ActivityInstrumentationTestCase2<HelloAndroidActivity> {
	
    private HelloAndroidActivity mActivity;
    private TextView mView;
    private String mResourceString;
	
	public HelloAndroidTest() {
		super("net.mogoweb.samples", HelloAndroidActivity.class);
	}

    @Override
    protected void setUp() throws Exception {
    	super.setUp();
    	
        mActivity = this.getActivity();
        mView = (TextView) mActivity.findViewById(net.mogoweb.samples.R.id.textview);
        mResourceString = mActivity.getString(net.mogoweb.samples.R.string.hello);
    }
    
    public void testPreconditions() {
        assertNotNull(mView);
    }
    
    public void testText() {
        assertEquals(mResourceString, (String)mView.getText());
    }
}
